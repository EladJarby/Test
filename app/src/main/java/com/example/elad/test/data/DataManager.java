package com.example.elad.test.data;

import com.example.elad.test.data.local.LocalDataManager;
import com.example.elad.test.data.remote.RemoteDataManager;

public class DataManager {

    private LocalDataManager localDataManager;
    private RemoteDataManager remoteDataManager;

    public DataManager(RemoteDataManager remoteDataManager , LocalDataManager localDataManager) {
        this.localDataManager = localDataManager;
        this.remoteDataManager = remoteDataManager;
    }

    public LocalDataManager getLocalDataManager() {
        return localDataManager;
    }

    public void setLocalDataManager(LocalDataManager localDataManager) {
        this.localDataManager = localDataManager;
    }

    public RemoteDataManager getRemoteDataManager() {
        return remoteDataManager;
    }

    public void setRemoteDataManager(RemoteDataManager remoteDataManager) {
        this.remoteDataManager = remoteDataManager;
    }
}
