package com.medialink.daggerstarwar.di.module;

import android.content.Context;

import com.medialink.daggerstarwar.di.qualifier.ApplicationContext;
import com.medialink.daggerstarwar.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
