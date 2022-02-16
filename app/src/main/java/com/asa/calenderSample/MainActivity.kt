package com.asa.calenderSample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asa.calenderSample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTitle(R.string.app_name)

    }
}