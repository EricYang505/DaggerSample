package com.dagger2.course.dagger;

import com.dagger2.base.ApplicationComponent;
import com.dagger2.base.ModuleScope;
import com.dagger2.course.CourseActivity;
import com.dagger2.course.MyCourseRepository;
import com.dagger2.course.courseContent.QuizActivity;
import dagger.Component;

@ModuleScope
@Component(dependencies = ApplicationComponent.class, modules = {CourseModule.class, CourseSubcomponentsModule.class})
public interface CourseComponent {

  MyCourseRepository myCourseRepository();

  CourseContentSubComponent.Factory courseContentSubComponent();

  VideoPlayerSubComponent.Factory videoPlayerSubComponent();

  void inject(CourseActivity courseActivity);

  void inject(QuizActivity quizActivity);

  @Component.Builder
  interface Builder {

    CourseComponent build();

    Builder applicationComponent(ApplicationComponent applicationComponent);
  }
}
