package com.dagger2.course.courseContent;

import com.dagger2.base.DataManager;
import com.dagger2.course.MyCourseRepository;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class QuizModule {
  @Provides static MyCourseRepository provideMyAuthorRepository(DataManager dataManager) {
    return new MyCourseRepository(dataManager);
  }
}