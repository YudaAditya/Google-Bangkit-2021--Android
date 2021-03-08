package com.dicoding.picodiploma.myviewandviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.myviewandviews.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Google Pixel"
    }
}