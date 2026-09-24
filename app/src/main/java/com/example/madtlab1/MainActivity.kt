package com.example.madtlab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Button)
        val textView = findViewById<TextView>(R.id.Button)

        button.setOnClickListener {
            textView.text = "Hello from my app!"
        }

        val buttonColor = findViewById<Button>(R.id.buttonColor)

        buttonColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}