package com.example.vaishnavi.daggerditest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BackendServiceModule {

    @Singleton
    @Provides
    BackendService provideBackendService(String serverUrl){
        return  new BackendService(serverUrl);
    }


}
