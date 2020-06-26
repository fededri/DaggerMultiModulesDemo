package com.fedetto.utilities.di

import android.app.Application
import com.fedetto.core.IResourceProvider
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UtilsModule::class])
interface UtilsComponent {

    fun getResourceProvider() : IResourceProvider

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): UtilsComponent.Builder

        fun build(): UtilsComponent
    }
}