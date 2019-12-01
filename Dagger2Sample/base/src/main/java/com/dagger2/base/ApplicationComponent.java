package com.dagger2.base;

import javax.inject.Singleton;
import dagger.Component;

// Definition of the Application graph
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  MySharePreferences mySharePreferences();

  DataManager dataManager();
}
