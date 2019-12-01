package com.dagger2.course.courseContent;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dagger2.base.MySharePreferences;
import com.dagger2.course.BaseCourseModuleFragment;
import com.dagger2.course.MyCourseRepository;
import com.dagger2.course.R;
import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseContentFragment extends BaseCourseModuleFragment {

  @Inject MyCourseRepository myCourseRepository;
  @Inject MySharePreferences mySharePreferences;

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    courseComponent.courseContentSubComponent().create().inject(this);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    myCourseRepository.fetchCourse();
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_course_content, container, false);
    TextView contextText = view.findViewById(R.id.content_text);
    contextText.setText(mySharePreferences.getCourseName());
    view.findViewById(R.id.open_quiz_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(getActivity(), QuizActivity.class));
      }
    });
    return view;
  }

}
