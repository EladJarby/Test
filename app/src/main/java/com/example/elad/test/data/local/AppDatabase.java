package com.example.elad.test.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.elad.test.data.local.roomdb.ContactsItemDao;
import com.example.elad.test.data.local.roomdb.DataTypeConverters;
import com.example.elad.test.data.model.ContactsItem;

@Database(entities = {ContactsItem.class}, version = 1)
@TypeConverters({DataTypeConverters.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactsItemDao contactsItemDao();
}
