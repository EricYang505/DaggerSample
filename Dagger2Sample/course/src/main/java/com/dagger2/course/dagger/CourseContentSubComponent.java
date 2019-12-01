package com.dagger2.course.dagger;

import com.dagger2.base.FeatureScope;
import com.dagger2.course.courseContent.CourseContentFragment;
import dagger.Subcomponent;

@FeatureScope
@Subcomponent
public interface CourseContentSubComponent {

  void inject(CourseContentFragment courseContentFragment);

  // Factory that is used to create instances of this subcomponent
  @Subcomponent.Factory
  interface Factory {
    CourseContentSubComponent create();
  }
}
