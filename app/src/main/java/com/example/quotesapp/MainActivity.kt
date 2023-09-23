package com.example.quotesapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_main_activity)

        val quotes = arrayOf(
            "Volvo",
            "BMW",
            "Ford",
            "Mazda"
        )

        val txt_quote = findViewById<TextView>(R.id.text_home)

        findViewById<Button>(R.id.btn_refresh)?.setOnClickListener {
            // Code here executes on main thread after user presses button
            txt_quote.text = quotes[(quotes.indices).random()]
        }
    }
}