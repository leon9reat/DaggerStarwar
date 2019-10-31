package com.medialink.daggerstarwar.di.component;

import com.medialink.daggerstarwar.di.scope.ActivityScope;
import com.medialink.daggerstarwar.ui.DetailActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
@ActivityScope
public interface DetailActivityComponent {
    void injectDetail(DetailActivity detailActivity);
}
