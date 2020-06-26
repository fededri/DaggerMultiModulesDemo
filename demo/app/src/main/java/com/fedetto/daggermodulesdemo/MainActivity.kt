package com.fedetto.daggermodulesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.fedetto.core.IntentProvider
import com.fedetto.core.UserController
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userController: UserController

    @Inject
    lateinit var intentProvider: IntentProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.textView).text = "Hello ${userController.getName()}"

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(intentProvider.loginActivity())
        }

    }
}