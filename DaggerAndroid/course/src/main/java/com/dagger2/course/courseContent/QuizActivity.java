package com.dagger2.course.courseContent;

import android.os.Bundle;
import android.widget.TextView;
import com.dagger2.base.BaseActivity;
import com.dagger2.base.MySharePreferences;
import com.dagger2.course.MyCourseRepository;
import com.dagger2.course.R;
import javax.inject.Inject;
import dagger.android.AndroidInjection;

public class QuizActivity extends BaseActivity {

  @Inject MyCourseRepository myCourseRepository;
  @Inject MySharePreferences mySharePreferences;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quiz);
    TextView quizText = findViewById(R.id.quiz_text);
    quizText.setText(mySharePreferences.getCourseName());
    myCourseRepository.fetchCourse();
  }
}
