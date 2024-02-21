package com.example.splashscreenserverside

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SpWithGifActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp_with_gif)
        supportActionBar?.hide()
    }
}