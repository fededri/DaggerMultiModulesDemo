package com.fedetto.utilities.di

import android.app.Application
import android.content.Context
import com.fedetto.core.IResourceProvider
import com.fedetto.utilities.ResourceProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UtilsModule {
    @Binds
    abstract fun bindContext(application: Application): Context

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun bindResourceProvider(context: Context): IResourceProvider {
            return ResourceProviderImpl(context)
        }
    }

}