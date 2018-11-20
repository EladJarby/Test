package com.example.elad.test.screens.main.impl;

import android.util.Log;

import com.example.elad.test.data.DataManager;
import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.data.model.ContactsList;
import com.example.elad.test.screens.main.contracts.MainContract;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@ActivityScope
public class MainPresenter implements MainContract.Presenter {

    DataManager dataManager;
    MainContract.Interactor interactor;
    MainContract.View view;

    @Inject
    MainPresenter(MainContract.Interactor interactor, DataManager dataManager) {
        this.interactor = interactor;
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
    }
}
