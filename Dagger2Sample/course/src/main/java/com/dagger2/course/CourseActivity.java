package com.dagger2.course;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.dagger2.course.courseContent.CourseContentFragment;
import com.dagger2.course.videoPlayer.VideoPlayerFragment;
import javax.inject.Inject;

public class CourseActivity extends BaseCourseModuleActivity {

  @Inject MyCourseRepository myCourseRepository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course);
    courseComponent.inject(this);
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
}
