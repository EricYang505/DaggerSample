package com.dagger2.course.dagger;

import dagger.Module;

@Module(subcomponents = {VideoPlayerSubComponent.class, CourseContentSubComponent.class})
public class CourseSubcomponentsModule {
}
