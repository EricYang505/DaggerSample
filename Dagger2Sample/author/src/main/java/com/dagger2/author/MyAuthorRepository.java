package com.dagger2.author;

import androidx.annotation.NonNull;
import com.dagger2.base.DataManager;

public class MyAuthorRepository {
  private final DataManager dataManager;

  public MyAuthorRepository(@NonNull DataManager dataManager) {
    this.dataManager = dataManager;
  }

  public void fetchAuthor() {
    dataManager.sendRequest();
  }
}
