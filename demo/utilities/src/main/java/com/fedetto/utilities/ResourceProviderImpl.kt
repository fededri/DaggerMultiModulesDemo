package com.fedetto.utilities

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.fedetto.core.IResourceProvider

class ResourceProviderImpl(private val context: Context) : IResourceProvider {
    override fun getString(resourceId: Int): String {
        return context.getString(resourceId)
    }

    override fun getString(id: Int, vararg args: Any?): String {
        return context.getString(id, *args)
    }


    override fun getDrawable(drawableRes: Int): Drawable {
        return requireNotNull(ContextCompat.getDrawable(context, drawableRes))
    }
}