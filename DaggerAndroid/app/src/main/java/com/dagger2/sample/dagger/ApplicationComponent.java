package com.dagger2.sample.dagger;

import com.dagger2.sample.MyApplication;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

// Definition of the Application graph
@Singleton
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, ActivityBuilderModule.class})
public interface ApplicationComponent {

  void inject(MyApplication app);
}
