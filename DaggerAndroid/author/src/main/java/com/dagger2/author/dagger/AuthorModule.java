package com.dagger2.author.dagger;

import com.dagger2.author.MyAuthorRepository;
import com.dagger2.base.DataManager;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class AuthorModule {
  @Provides static MyAuthorRepository provideMyAuthorRepository(DataManager dataManager) {
    return new MyAuthorRepository(dataManager);
  }
}