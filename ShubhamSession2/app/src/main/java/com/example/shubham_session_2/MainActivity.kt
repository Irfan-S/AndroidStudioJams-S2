package com.example.shubham_session_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textview1 = findViewById<TextView>(R.id.textview1)
        var gettext1 = textview1.text.toString()
    }
}