package com.dagger2.course;

import com.dagger2.base.DataManager;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class CourseModule {
  @Provides static MyCourseRepository provideMyAuthorRepository(DataManager dataManager) {
    return new MyCourseRepository(dataManager);
  }
}