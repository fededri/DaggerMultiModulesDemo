package com.fedetto.core

import android.content.Intent
import javax.inject.Inject

const val PACKAGE_PREFIX = "com.fedetto.daggermodulesdemo"
const val LOGIN = "login"
const val  MAIN = "main"

class IntentProvider @Inject constructor() {

    private fun getIntent(filter: String): Intent {
        return Intent().apply { action = "${PACKAGE_PREFIX}.$filter" }
    }

    fun loginActivity(): Intent {
        return getIntent(LOGIN)
    }

    fun mainActivity(): Intent {
        return getIntent(MAIN)
    }
}