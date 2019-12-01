package com.dagger2.course.dagger;

import com.dagger2.base.FeatureScope;
import com.dagger2.course.videoPlayer.VideoPlayerFragment;
import dagger.Subcomponent;

@FeatureScope
@Subcomponent
public interface VideoPlayerSubComponent {

  void inject(VideoPlayerFragment videoPlayerFragment);

  // Factory that is used to create instances of this subcomponent
  @Subcomponent.Factory
  interface Factory {
    VideoPlayerSubComponent create();
  }
}
