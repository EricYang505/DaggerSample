package com.dagger2.course.dagger;

import androidx.annotation.NonNull;
import com.dagger2.base.DataManager;
import com.dagger2.base.ModuleScope;
import com.dagger2.course.MyCourseRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class CourseModule {

  @ModuleScope
  @Provides
  @NonNull
  public MyCourseRepository providCourseRepository(@NonNull DataManager dataManager) {
    return new MyCourseRepository(dataManager);
  }

}
