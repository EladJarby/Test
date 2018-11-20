package com.example.elad.test.screens.main.fragments.contactslist.impl;

import android.support.v4.util.Consumer;
import android.util.Log;

import com.example.elad.test.data.DataManager;
import com.example.elad.test.data.dagger.scopes.FragmentScope;
import com.example.elad.test.data.model.ContactsItem;
import com.example.elad.test.screens.main.fragments.contactslist.contracts.ContactsListContract;

import java.util.List;

import javax.inject.Inject;

@FragmentScope
public class ContactsListPresenter implements ContactsListContract.Presenter {

    DataManager dataManager;
    ContactsListContract.View view;

    @Inject
    ContactsListPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(ContactsListContract.View view) {
        this.view = view;
        init();
    }

    private void init() {
        if(view != null) {
            view.setData(dataManager.getLocalDataManager().getAppDatabase().contactsItemDao().getAllContacts());
        }
    }

    @Override
    public void onDetach() {
        view = null;
    }
}
