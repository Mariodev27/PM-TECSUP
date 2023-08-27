package com.santisteban.mario.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGreetings = findViewById<TextView>(R.id.tvGreetings)

        tvGreetings.text = "Saludos C24"
    }
}