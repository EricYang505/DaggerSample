package com.dagger2.course.videoPlayer;


import android.app.Fragment;
import android.content.Context;
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
public class VideoPlayerFragment extends BaseCourseModuleFragment {

  @Inject MyCourseRepository myCourseRepository;
  @Inject MySharePreferences mySharePreferences;

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    courseComponent.videoPlayerSubComponent().create().inject(this);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    myCourseRepository.fetchCourse();
    View view =  inflater.inflate(R.layout.fragment_video_player, container, false);
    TextView contextText = view.findViewById(R.id.video_text);
    contextText.setText(mySharePreferences.getQuizName());
    return view;
  }

}
