package com.fedetto.daggermodulesdemo

import com.fedetto.core.di.CoreComponent
import com.fedetto.core.di.DaggerCoreComponent
import com.fedetto.daggermodulesdemo.di.DaggerAppComponent
import com.fedetto.utilities.di.DaggerUtilsComponent
import com.fedetto.utilities.di.UtilsComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication() {

    private lateinit var coreComponent: CoreComponent


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .coreComponent(getCoreComponent())
            .utilsComponent(getUtilsComponent())
            .build()

    }

    private fun getCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }

        return coreComponent
    }

    private fun getUtilsComponent(): UtilsComponent {
        return DaggerUtilsComponent
            .builder()
            .application(this)
            .build()
    }
}