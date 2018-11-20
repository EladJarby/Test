package com.example.elad.test.screens.main;

import android.os.Bundle;
import android.widget.TextView;

import com.example.elad.test.R;
import com.example.elad.test.screens.base.BaseActivity;
import com.example.elad.test.screens.main.contracts.MainContract;
import com.example.elad.test.screens.main.fragments.contactslist.ContactsListFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;

    TextView mainText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.onAttach(this);

        ContactsListFragment contactsListFragment = new ContactsListFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_fragment_container,contactsListFragment,null)
                .commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }
}
