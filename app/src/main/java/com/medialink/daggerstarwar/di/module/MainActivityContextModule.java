package com.medialink.daggerstarwar.di.module;

import android.content.Context;

import com.medialink.daggerstarwar.di.qualifier.ActivityContext;
import com.medialink.daggerstarwar.di.scope.ActivityScope;
import com.medialink.daggerstarwar.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {
    private MainActivity activity;
    private Context context;

    public MainActivityContextModule(MainActivity activity) {
        this.activity = activity;
        context = activity;
    }

    @Provides
    @ActivityScope
    public MainActivity provideMainActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
