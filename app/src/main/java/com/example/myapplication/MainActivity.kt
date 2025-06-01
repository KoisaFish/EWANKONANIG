package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnLogin)
        val txtMyName = findViewById<EditText>(R.id.Username)


        button.setOnClickListener {
            val intent = Intent(applicationContext, Activity2::class.java)
            intent.putExtra("val1", txtMyName.text.toString())
            startActivity(intent)

        }

    }
}