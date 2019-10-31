package com.medialink.daggerstarwar.di.component;

import android.content.Context;

import com.medialink.daggerstarwar.MyApplication;
import com.medialink.daggerstarwar.di.module.ContextModule;
import com.medialink.daggerstarwar.di.module.RetrofitModule;
import com.medialink.daggerstarwar.di.qualifier.ApplicationContext;
import com.medialink.daggerstarwar.di.scope.ApplicationScope;
import com.medialink.daggerstarwar.retrofit.ApiInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    ApiInterface getApiInterface();

    @ApplicationContext
    Context getContext();

    void injectApplication(MyApplication application);

}
