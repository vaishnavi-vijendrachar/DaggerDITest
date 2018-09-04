package com.example.vaishnavi.daggerditest;

import dagger.Component;

@Component(modules = {UserModule.class,BackendServiceModule.class})
public interface AppComponent {
    Void Inject(MainActivity mainActivity);
}
