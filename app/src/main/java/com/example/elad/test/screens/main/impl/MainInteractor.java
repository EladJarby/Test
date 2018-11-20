package com.example.elad.test.screens.main.impl;

import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.data.model.ContactsList;
import com.example.elad.test.data.remote.Api;
import com.example.elad.test.screens.main.contracts.MainContract;

import javax.inject.Inject;

import retrofit2.Call;

@ActivityScope
public class MainInteractor implements MainContract.Interactor {

    @Inject
    public MainInteractor() {
    }
}
