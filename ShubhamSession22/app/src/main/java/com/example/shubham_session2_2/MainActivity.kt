package com.example.shubham_session2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shubham_session2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding = ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}