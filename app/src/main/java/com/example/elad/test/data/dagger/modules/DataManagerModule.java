package com.example.elad.test.data.dagger.modules;

import com.example.elad.test.constant.Constants;
import com.example.elad.test.data.DataManager;
import com.example.elad.test.data.local.AppDatabase;
import com.example.elad.test.data.local.LocalDataManager;
import com.example.elad.test.data.remote.Api;
import com.example.elad.test.data.remote.RemoteDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class DataManagerModule {

    @Provides
    RemoteDataManager provideRemoteDataManager(Api api) {
        return new RemoteDataManager(api);
    }

    @Provides
    @Singleton
    LocalDataManager provideLocalDataManager(AppDatabase appDatabase) {
        return new LocalDataManager(appDatabase);
    }

    @Provides
    @Singleton
    DataManager provideDataManager(RemoteDataManager remoteDataManager, LocalDataManager localDataManager) {
        return new DataManager(remoteDataManager,localDataManager);
    }

    @Provides
    Retrofit provideRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    Api api() {
        return provideRetrofitInstance().create(Api.class);
    }
}
