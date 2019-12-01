package com.dagger2.course;

import android.os.Bundle;
import com.dagger2.base.BaseActivity;
import com.dagger2.course.dagger.CourseComponent;
import com.dagger2.course.dagger.DaggerCourseComponent;

public class BaseCourseModuleActivity extends BaseActivity {

  protected CourseComponent courseComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    courseComponent = DaggerCourseComponent.builder()
                                           .applicationComponent(applicationComponent)
                                           .build();
  }
}
