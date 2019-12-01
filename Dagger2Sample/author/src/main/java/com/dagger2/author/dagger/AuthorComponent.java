package com.dagger2.author.dagger;

import com.dagger2.author.AuthorActivity;
import com.dagger2.author.MyAuthorRepository;
import com.dagger2.base.ApplicationComponent;
import com.dagger2.base.ModuleScope;
import dagger.Component;

@ModuleScope
@Component(dependencies = ApplicationComponent.class, modules = AuthorModule.class)
public interface AuthorComponent {

  MyAuthorRepository myAuthorRepository();

  void inject(AuthorActivity authorActivity);

  @Component.Builder
  interface Builder {

    AuthorComponent build();

    Builder applicationComponent(ApplicationComponent applicationComponent);
  }
}
