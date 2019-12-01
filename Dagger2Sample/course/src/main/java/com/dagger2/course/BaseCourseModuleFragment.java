package com.dagger2.course;

import android.app.Fragment;
import android.content.Context;
import com.dagger2.course.dagger.CourseComponent;

public class BaseCourseModuleFragment extends Fragment {

  protected CourseComponent courseComponent;

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    courseComponent = ((BaseCourseModuleActivity) getActivity()).courseComponent;
  }
}
