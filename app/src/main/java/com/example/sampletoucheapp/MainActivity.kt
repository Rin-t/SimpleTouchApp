package com.example.sampletoucheapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val dogButton: Button = findViewById(R.id.buttonDog)
        val catButton: Button = findViewById(R.id.buttonCat)
        val clearButton: Button = findViewById(R.id.buttonClear)

        dogButton.setOnClickListener {
            textView.text = "いぬ"
        }

        catButton.setOnClickListener {
            textView.text = "ねこ"
        }

        clearButton.setOnClickListener {
            textView.text = ""
        }

    }
}