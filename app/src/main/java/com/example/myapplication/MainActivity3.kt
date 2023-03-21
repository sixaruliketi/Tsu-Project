package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val text1 = findViewById<TextView>(R.id.textView1)
        val text2 = findViewById<TextView>(R.id.textView2)

        text1.text = intent.extras?.getString("NAME","")
        text2.text = intent.extras?.getInt("AGE",0).toString()
    }
}