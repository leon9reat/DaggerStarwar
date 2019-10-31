package com.medialink.daggerstarwar;

import android.app.Activity;
import android.app.Application;

import com.medialink.daggerstarwar.di.component.ApplicationComponent;
import com.medialink.daggerstarwar.di.component.DaggerApplicationComponent;
import com.medialink.daggerstarwar.di.module.ContextModule;

public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
        applicationComponent.injectApplication(this);
    }

    public static MyApplication get(Activity activity) {
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
