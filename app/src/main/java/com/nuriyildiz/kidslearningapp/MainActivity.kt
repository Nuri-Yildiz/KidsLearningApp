package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun returnQuizPage(view: View){
        val intent = Intent(applicationContext,QuestionMenuActivity::class.java)
        startActivity(intent)
    }
    fun goToColors(view: View){
        val intent2 = Intent(applicationContext,ColorActivity::class.java)
        startActivity(intent2)
    }


}