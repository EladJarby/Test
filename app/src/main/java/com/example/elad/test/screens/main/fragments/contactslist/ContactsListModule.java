package com.example.elad.test.screens.main.fragments.contactslist;

import com.example.elad.test.data.dagger.scopes.FragmentScope;
import com.example.elad.test.screens.main.fragments.contactslist.contracts.ContactsListContract;
import com.example.elad.test.screens.main.fragments.contactslist.impl.ContactsListPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ContactsListModule {
    @FragmentScope
    @Binds
    abstract ContactsListContract.Presenter contactsListContractPresenter(ContactsListPresenter mainPresenter);

}

