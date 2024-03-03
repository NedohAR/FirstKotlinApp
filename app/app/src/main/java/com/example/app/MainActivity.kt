package com.example.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button3)
        val textView2: TextView = findViewById(R.id.textView2)

        textView.text = "Hello world"

        button.setOnClickListener {
            clickCount++
            textView2.text = "Click: $clickCount"
        }
    }
}