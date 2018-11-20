package com.example.elad.test.screens.main;

import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.screens.main.contracts.MainContract;
import com.example.elad.test.screens.main.impl.MainInteractor;
import com.example.elad.test.screens.main.impl.MainPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {
    @ActivityScope
    @Binds
    abstract MainContract.Presenter mainContractPresenter(MainPresenter mainPresenter);

    @ActivityScope
    @Binds
    abstract MainContract.Interactor mainContractInteractor(MainInteractor mainInteractor);
}
