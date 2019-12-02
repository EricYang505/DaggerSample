package com.dagger2.sample;

import android.app.Application;
import com.dagger2.sample.dagger.DaggerApplicationComponent;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class MyApplication extends Application implements HasAndroidInjector {

  @Inject DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerApplicationComponent.create().inject(this);
  }

  @Override
  public AndroidInjector<Object> androidInjector() {
    return dispatchingAndroidInjector;
  }
}
