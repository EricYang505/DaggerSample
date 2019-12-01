package com.dagger2.author;

import android.os.Bundle;
import android.widget.TextView;
import com.dagger2.author.dagger.AuthorComponent;
import com.dagger2.author.dagger.DaggerAuthorComponent;
import com.dagger2.base.BaseActivity;
import com.dagger2.base.MySharePreferences;
import javax.inject.Inject;

public class AuthorActivity extends BaseActivity {

  @Inject MyAuthorRepository myAuthorRepository;
  @Inject MySharePreferences mySharePreferences;
  private AuthorComponent authorComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    authorComponent = DaggerAuthorComponent.builder()
                                           .applicationComponent(applicationComponent)
                                           .build();
    authorComponent.inject(this);
    setContentView(R.layout.activity_author);
    TextView textView = findViewById(R.id.author_text);
    textView.setText(mySharePreferences.getAuthorName());
    myAuthorRepository.fetchAuthor();
  }
}
