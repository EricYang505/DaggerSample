package com.dagger2.base;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

  protected ApplicationComponent applicationComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    applicationComponent = ((BaseApplication)getApplication()).getAppComponent();
  }
}
