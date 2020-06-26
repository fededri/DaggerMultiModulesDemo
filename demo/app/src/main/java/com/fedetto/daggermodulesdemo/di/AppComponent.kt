package com.fedetto.daggermodulesdemo.di

import android.app.Application
import com.fedetto.core.di.CoreComponent
import com.fedetto.daggermodulesdemo.MainApplication
import com.fedetto.utilities.di.UtilsComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBindingModule::class
    ],
    dependencies = [CoreComponent::class, UtilsComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun coreComponent(coreComponent: CoreComponent): AppComponent.Builder
        fun utilsComponent(utilsComponent: UtilsComponent): AppComponent.Builder
        fun build(): AppComponent
    }
}