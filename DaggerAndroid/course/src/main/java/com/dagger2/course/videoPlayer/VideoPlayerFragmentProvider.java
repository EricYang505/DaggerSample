package com.dagger2.course.videoPlayer;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public  abstract class VideoPlayerFragmentProvider {
  @ContributesAndroidInjector(modules = VideoPlayerModule.class)
  abstract VideoPlayerFragment provideVideoPlayerFragmentFactory();
}
