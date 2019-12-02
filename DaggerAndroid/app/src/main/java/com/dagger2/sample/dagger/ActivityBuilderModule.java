package com.dagger2.sample.dagger;

import com.dagger2.author.AuthorActivity;
import com.dagger2.author.dagger.AuthorModule;
import com.dagger2.course.CourseActivity;
import com.dagger2.course.CourseModule;
import com.dagger2.course.courseContent.CourseContentFragmentProvider;
import com.dagger2.course.courseContent.QuizActivity;
import com.dagger2.course.courseContent.QuizModule;
import com.dagger2.course.videoPlayer.VideoPlayerFragmentProvider;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

  @ActivityScope
  @ContributesAndroidInjector(modules = AuthorModule.class)
  abstract AuthorActivity contributeAuthorAndroidInjector();

  @ActivityScope
  @ContributesAndroidInjector(modules = {CourseModule.class, CourseContentFragmentProvider.class, VideoPlayerFragmentProvider.class})
  abstract CourseActivity contributeCourseAndroidInjector();

  @ActivityScope
  @ContributesAndroidInjector(modules = QuizModule.class)
  abstract QuizActivity contributeQuizAndroidInjector();
}
