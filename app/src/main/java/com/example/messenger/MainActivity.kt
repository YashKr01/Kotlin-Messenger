package com.example.messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.fragments.PhoneFragment
import com.example.messenger.fragments.ProfileFragment
import com.example.messenger.fragments.UserDataFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, PhoneFragment())
            .commit()


    }
}