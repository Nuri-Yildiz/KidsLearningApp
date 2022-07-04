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
    fun goToAlphabet(view: View){
        val intent = Intent(applicationContext,AlphabetActivity::class.java)
        startActivity(intent)
    }
    fun goToColors(view: View){
        val intent2 = Intent(applicationContext,ColorActivity::class.java)
        startActivity(intent2)
    }
    fun goToNumbers(view: View){
        val intent = Intent(applicationContext,NumbersActivity::class.java)
        startActivity(intent)
    }
    fun goToGame1(view: View){
        val intent = Intent(applicationContext,GameStartMenu::class.java)
        intent.putExtra("gameName","MemoryGame")
        startActivity(intent)
    }
    fun goToGame2(view: View){
        val intent = Intent(applicationContext,GameStartMenu::class.java)
        intent.putExtra("gameName","CatchTheMole")
        startActivity(intent)
    }
    fun goToColorTest(view: View){
        val intent = Intent(applicationContext,ColorTestActivity::class.java)
        startActivity(intent)
    }
    fun goToNumberGame(view: View){
        val intent = Intent(applicationContext,BigNumberGame::class.java)
        startActivity(intent)
    }
    fun goToAlphabetGame(view: View){
        val intent = Intent(applicationContext,AlphabetGame::class.java)
        startActivity(intent)
    }


}