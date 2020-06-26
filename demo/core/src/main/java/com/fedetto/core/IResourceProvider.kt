package com.fedetto.core

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface IResourceProvider {
    fun getString(@StringRes resourceId : Int) : String

    fun getString(@StringRes id: Int, vararg args: Any?): String

    fun getDrawable(@DrawableRes drawableRes: Int): Drawable
}