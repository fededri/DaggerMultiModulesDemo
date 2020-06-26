package com.fedetto.daggermodulesdemo.di

import com.fedetto.core.di.ActivityScope
import com.fedetto.daggermodulesdemo.MainActivity
import com.fedetto.login.LoginActivity
import com.fedetto.login.di.LoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [LoginModule::class])
    @ActivityScope
    abstract fun loginActivity(): LoginActivity
}