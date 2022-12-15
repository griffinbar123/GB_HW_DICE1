package com.example.gb_hw_dice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gb_hw_dice1.R
import android.content.Intent
import android.os.Handler
import com.example.gb_hw_dice1.MainActivity

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        val x = Handler()
        val intent = Intent(this, MainActivity::class.java)
        x.postDelayed({ startActivity(intent) }, 2000)
    }
}