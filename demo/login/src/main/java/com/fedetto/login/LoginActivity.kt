package com.fedetto.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.fedetto.core.IResourceProvider
import com.fedetto.core.IntentProvider
import com.fedetto.core.UserController
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {


    @Inject
    lateinit var userController: UserController

    //The implementation of this interface is provided by Utilities module, but login has not a dependency on utilities
    @Inject
    lateinit var resourceProvider: IResourceProvider

    @Inject
    lateinit var intentProvider: IntentProvider


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        initViews()
    }


    private fun initViews() {
        findViewById<TextView>(R.id.text).text =
            resourceProvider.getString(R.string.some_string)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(intentProvider.mainActivity())
        }
    }
}