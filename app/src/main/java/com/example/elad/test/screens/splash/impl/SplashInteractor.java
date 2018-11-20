package com.example.elad.test.screens.splash.impl;

import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.data.model.ContactsList;
import com.example.elad.test.data.remote.Api;
import com.example.elad.test.screens.splash.contracts.SplashContract;

import javax.inject.Inject;

import retrofit2.Call;

@ActivityScope
public class SplashInteractor implements SplashContract.Interactor {

    @Inject
    public SplashInteractor() {
    }

    @Override
    public Call<ContactsList> getJson(Api api) {
        return api.getJson();
    }
}