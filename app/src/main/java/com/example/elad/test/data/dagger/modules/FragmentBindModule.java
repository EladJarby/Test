package com.example.elad.test.data.dagger.modules;

import com.example.elad.test.data.dagger.scopes.FragmentScope;
import com.example.elad.test.screens.main.fragments.contactslist.ContactsListFragment;
import com.example.elad.test.screens.main.fragments.contactslist.ContactsListModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBindModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = {ContactsListModule.class})
    abstract ContactsListFragment contactsListFragment();
}
