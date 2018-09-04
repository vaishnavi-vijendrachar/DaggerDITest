package com.example.vaishnavi.daggerditest;

import javax.inject.Singleton;

import dagger.Provides;

public class UserModule {
    @Singleton
    @Provides
    User providesUser(){
        return new User("abc","def");
    }
}
