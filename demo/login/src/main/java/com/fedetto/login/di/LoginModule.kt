package com.fedetto.login.di

import com.fedetto.login.Foo
import dagger.Module
import dagger.Provides

@Module
class LoginModule {
    @Provides
    fun provideFoo() = Foo()
}