package com.example.elad.test.data.dagger.modules;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.elad.test.data.local.AppDatabase;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    @Provides
    AppDatabase provideDatabase(Context context) {
        return Room.databaseBuilder(context,AppDatabase.class,"db").build();
    }
}
