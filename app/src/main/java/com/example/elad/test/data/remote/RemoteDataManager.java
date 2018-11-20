package com.example.elad.test.data.remote;

public class RemoteDataManager {
    Api api;
    public RemoteDataManager(Api api) {
        this.api = api;
    }

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }
}
