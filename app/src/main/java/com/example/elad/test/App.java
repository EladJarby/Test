package com.example.elad.test;

import com.example.elad.test.data.dagger.AppComponent;
import com.example.elad.test.data.dagger.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class App extends DaggerApplication {

    AppComponent appComponent;
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        appComponent = DaggerAppComponent.builder().application(this).build();
        return appComponent;
    }
}
