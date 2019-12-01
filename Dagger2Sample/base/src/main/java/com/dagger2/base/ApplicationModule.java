package com.dagger2.base;

import androidx.annotation.NonNull;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

  @Provides
  @Singleton
  @NonNull
  public MySharePreferences provideMySharePreferences() {
    return new MySharePreferences();
  }
}
