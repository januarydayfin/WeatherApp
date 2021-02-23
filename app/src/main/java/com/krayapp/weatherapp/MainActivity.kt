package com.krayapp.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity() : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var textview1: TextView
    private lateinit var textview2: TextView
    private var counter1: Int = 0;
    private var counter2: Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


    private fun initViews() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        textview1 = findViewById(R.id.first_text)
        textview2 = findViewById(R.id.second_text)
        clickListener()
    }

    private fun clickListener() {
        button1.setOnClickListener {
            counter1 += 1
            textview1.text = counter1.toString()
        }
        button2.setOnClickListener {
            counter2 += 2
            textview2.text = counter2.toString()
        }
    }
}