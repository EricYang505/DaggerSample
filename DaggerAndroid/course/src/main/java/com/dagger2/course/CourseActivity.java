package com.dagger2.course;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.dagger2.base.BaseActivity;
import com.dagger2.course.courseContent.CourseContentFragment;
import com.dagger2.course.videoPlayer.VideoPlayerFragment;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class CourseActivity extends BaseActivity implements HasAndroidInjector {

  @Inject DispatchingAndroidInjector<Object> androidInjector;
  @Inject MyCourseRepository myCourseRepository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course);
    myCourseRepository.fetchCourse();
    addVideoPlayerFragment();
    addCourseContentFragment();
  }

  private void addVideoPlayerFragment() {
    FragmentTransaction transaction = getFragmentManager().beginTransaction();
    Fragment videoPlayerFragment = new VideoPlayerFragment();
    transaction.add(R.id.video_player_container, videoPlayerFragment);
    transaction.commit();
  }

  private void addCourseContentFragment() {
    FragmentTransaction transaction = getFragmentManager().beginTransaction();
    Fragment courseContentFragment = new CourseContentFragment();
    transaction.add(R.id.video_content_container, courseContentFragment);
    transaction.commit();
  }

  @Override
  public AndroidInjector<Object> androidInjector() {
    return androidInjector;
  }
}
