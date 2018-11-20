package com.example.elad.test.data.dagger.modules;

import com.example.elad.test.screens.main.MainActivity;
import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.screens.main.MainModule;
import com.example.elad.test.screens.splash.SplashActivity;
import com.example.elad.test.screens.splash.SplashModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract MainActivity mainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {SplashModule.class})
    abstract SplashActivity splashActivity();
}
