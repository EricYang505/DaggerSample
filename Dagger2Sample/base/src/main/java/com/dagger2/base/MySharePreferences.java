package com.dagger2.base;

import android.content.Context;

public class MySharePreferences {
  private Context context;

  public MySharePreferences() {}

  public String getCourseName() {
    return "Course Name from sharePreferences";
  }

  public String getAuthorName() {
    return "Author Name from sharePreferences";
  }

  public String getVideoName() {
    return "Video Name from sharePreferences";
  }

  public String getQuizName() {
    return "Quiz Name from sharePreferences";
  }
}
