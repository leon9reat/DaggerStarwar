package com.medialink.daggerstarwar.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.medialink.daggerstarwar.MyApplication;
import com.medialink.daggerstarwar.R;
import com.medialink.daggerstarwar.adapter.RecyclerViewAdapter;
import com.medialink.daggerstarwar.di.component.ApplicationComponent;
import com.medialink.daggerstarwar.di.component.DaggerMainActivityComponent;
import com.medialink.daggerstarwar.di.component.MainActivityComponent;
import com.medialink.daggerstarwar.di.module.MainActivityContextModule;
import com.medialink.daggerstarwar.di.qualifier.ActivityContext;
import com.medialink.daggerstarwar.di.qualifier.ApplicationContext;
import com.medialink.daggerstarwar.pojo.People;
import com.medialink.daggerstarwar.pojo.PeopleItem;
import com.medialink.daggerstarwar.retrofit.ApiInterface;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements RecyclerViewAdapter.ClickListener {
    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;
    MainActivityComponent mainActivityComponent;

    @Inject
    public RecyclerViewAdapter recyclerViewAdapter;

    @Inject
    public ApiInterface apiInterface;

    @Inject
    @ApplicationContext
    public Context context;

    @Inject
    @ActivityContext
    public Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        ApplicationComponent applicationComponent = MyApplication.get(this).getApplicationComponent();
        mainActivityComponent = DaggerMainActivityComponent.builder()
                .mainActivityContextModule(new MainActivityContextModule(this))
                .applicationComponent(applicationComponent)
                .build();

        mainActivityComponent.injectMainActivity(this);
        recyclerView.setAdapter(recyclerViewAdapter);

        apiInterface.getPeople(1)
                .enqueue(new Callback<People>() {
                    @Override
                    public void onResponse(Call<People> call, Response<People> response) {
                        populateRecyclerView(response.body().getResults());
                    }

                    @Override
                    public void onFailure(Call<People> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                });
    }

    private void populateRecyclerView(List<PeopleItem> response) {
        recyclerViewAdapter.setData(response);
    }

    @Override
    public void launchIntent(String filename) {
        Toast.makeText(context, "RecyclerView Row selected", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(activityContext, DetailActivity.class).putExtra("url", filename));
    }
}
