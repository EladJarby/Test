package com.example.elad.test.data.local;

public class LocalDataManager {
    AppDatabase appDatabase;

    public LocalDataManager(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }

    public void setAppDatabase(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }
}
