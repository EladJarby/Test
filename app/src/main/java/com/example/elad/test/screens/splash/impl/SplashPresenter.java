package com.example.elad.test.screens.splash.impl;

import com.example.elad.test.data.DataManager;
import com.example.elad.test.data.dagger.scopes.ActivityScope;
import com.example.elad.test.data.model.ContactsItem;
import com.example.elad.test.data.model.ContactsList;
import com.example.elad.test.screens.splash.contracts.SplashContract;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@ActivityScope
public class SplashPresenter implements SplashContract.Presenter {

    DataManager dataManager;
    SplashContract.Interactor interactor;
    SplashContract.View view;

    @Inject
    SplashPresenter(SplashContract.Interactor interactor, DataManager dataManager) {
        this.interactor = interactor;
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(SplashContract.View view) {
        this.view = view;
        init();
    }

    @Override
    public void init() {
        interactor.getJson(dataManager.getRemoteDataManager().getApi()).enqueue(new Callback<ContactsList>() {
            @Override
            public void onResponse(Call<ContactsList> call, Response<ContactsList> response) {
                if(response.body() != null) {
                    insertContacts(response.body().getContacts());
                }
            }

            @Override
            public void onFailure(Call<ContactsList> call, Throwable t) {

            }
        });
    }

    private void insertContacts(final List<ContactsItem> contacts) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                dataManager.getLocalDataManager().getAppDatabase().contactsItemDao().insertContacts(contacts);
            }
        });
    }

    @Override
    public void onDetach() {
        view = null;
    }
}

