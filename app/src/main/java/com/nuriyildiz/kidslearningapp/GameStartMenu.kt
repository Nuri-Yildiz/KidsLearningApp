package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_color_desc.*

class GameStartMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_start_menu)


    }
    fun goToGame(view: View){
        var intent=intent
        var gameName = intent.getStringExtra("gameName")
        when(gameName){
            "CatchTheMole" -> intent = Intent(applicationContext,CatchTheMole::class.java)

            "MemoryGame" -> intent = Intent(applicationContext,MemoryGame::class.java)

            else -> textView2.text="Çalışmadı"
        }
        startActivity(intent)
        finish();
    }
}