package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EndGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)
        var intent = Intent(applicationContext,BigNumberGame::class.java)
        var score = intent.getIntExtra("score",5)
        val textview = findViewById<TextView>(R.id.textView10)
        textview.text = score.toString()
    }




    }
