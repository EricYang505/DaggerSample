package com.dagger2.course;

import androidx.annotation.NonNull;
import com.dagger2.base.DataManager;

public class MyCourseRepository {

  private final DataManager dataManager;

  public MyCourseRepository(@NonNull DataManager dataManager) {
    this.dataManager = dataManager;
  }

  public void fetchCourse() {
    dataManager.sendRequest();
  }
}
