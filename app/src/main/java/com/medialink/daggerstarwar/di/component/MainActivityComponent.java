package com.medialink.daggerstarwar.di.component;

import android.content.Context;

import com.medialink.daggerstarwar.di.module.AdapterModule;
import com.medialink.daggerstarwar.di.qualifier.ActivityContext;
import com.medialink.daggerstarwar.di.scope.ActivityScope;
import com.medialink.daggerstarwar.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {AdapterModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {
    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity activity);
}
