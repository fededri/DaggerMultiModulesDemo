package com.fedetto.core.di

import com.fedetto.core.UserController
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [CoreModule::class]
)
@Singleton
interface CoreComponent {
    fun getUserController(): UserController
}