package com.example.elad.test.data.dagger;

import android.app.Application;

import com.example.elad.test.App;
import com.example.elad.test.data.DataManager;
import com.example.elad.test.data.dagger.modules.ActivityBindModule;
import com.example.elad.test.data.dagger.modules.ApplicationModule;
import com.example.elad.test.data.dagger.modules.DataManagerModule;
import com.example.elad.test.data.dagger.modules.FragmentBindModule;
import com.example.elad.test.data.dagger.modules.RoomModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityBindModule.class,
        ApplicationModule.class,FragmentBindModule.class,
        RoomModule.class, DataManagerModule.class})
public interface AppComponent extends AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
