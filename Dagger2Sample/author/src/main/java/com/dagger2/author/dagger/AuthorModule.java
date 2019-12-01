package com.dagger2.author.dagger;

import androidx.annotation.NonNull;
import com.dagger2.author.MyAuthorRepository;
import com.dagger2.base.DataManager;
import com.dagger2.base.ModuleScope;
import dagger.Module;
import dagger.Provides;

@Module
public class AuthorModule {

  @ModuleScope
  @Provides
  @NonNull
  public MyAuthorRepository providAuthorRepository(@NonNull DataManager dataManager) {
    return new MyAuthorRepository(dataManager);
  }

}
