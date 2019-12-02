package com.dagger2.course.courseContent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public  abstract class CourseContentFragmentProvider {
  @ContributesAndroidInjector(modules = CourseContentModule.class)
  abstract CourseContentFragment provideCourseContentFragmentFactory();
}
