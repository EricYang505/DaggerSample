package com.dagger2.sample.dagger;

import androidx.annotation.NonNull;
import com.dagger2.base.MySharePreferences;
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
