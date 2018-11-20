package com.example.elad.test.screens.splash;

import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.screens.splash.contracts.SplashContract;
import com.example.elad.test.screens.splash.impl.SplashInteractor;
import com.example.elad.test.screens.splash.impl.SplashPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SplashModule {
    @ActivityScope
    @Binds
    abstract SplashContract.Presenter splashContractPresenter(SplashPresenter splashPresenter);

    @ActivityScope
    @Binds
    abstract SplashContract.Interactor splashContractInteractor(SplashInteractor splashInteractor);
}
