package com.medialink.daggerstarwar.di.module;

import com.medialink.daggerstarwar.adapter.RecyclerViewAdapter;
import com.medialink.daggerstarwar.di.scope.ActivityScope;
import com.medialink.daggerstarwar.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {
    @Provides
    @ActivityScope
    public RecyclerViewAdapter providePeopleList(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener provideClickListener(MainActivity activity) {
        return activity;
    }
}
