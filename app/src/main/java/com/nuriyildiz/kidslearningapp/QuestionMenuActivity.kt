package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuestionMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_menu)
    }

    fun returnMainPage(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)

    }

}