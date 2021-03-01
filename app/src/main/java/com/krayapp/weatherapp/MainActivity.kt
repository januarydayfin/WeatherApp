package com.krayapp.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var barsikButton: Button
    private lateinit var textview1: TextView
    private lateinit var textview2: TextView
    private lateinit var barsikView: TextView
    private var barsik = DataStorage("Barsik", "Red")
    private var counter1: Int = 0
    private var counter2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


    private fun initViews() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        barsikButton = findViewById(R.id.barsik_button)
        textview1 = findViewById(R.id.first_text)
        textview2 = findViewById(R.id.second_text)
        barsikView = findViewById(R.id.barsik_view)
        clickListener()
    }

    private fun clickListener() {
        barsikButton.setOnClickListener {
            barsikView.text = ("Name " + barsik.name + " Color " + barsik.color)
        }
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