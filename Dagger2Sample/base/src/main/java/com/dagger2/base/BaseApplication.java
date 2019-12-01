package com.dagger2.base;

import android.app.Application;

public class BaseApplication extends Application {

  protected ApplicationComponent appComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    // Reference to the application graph that is used across the whole app
    appComponent = getAppComponent();
  }

  public ApplicationComponent getAppComponent() {
    if (appComponent == null) {
      appComponent = DaggerApplicationComponent.builder()
                                               .applicationModule(new ApplicationModule())
                                               .build();
    }
    return appComponent;
  }

}
