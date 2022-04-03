package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
    }
    fun goToBlack(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Siyah")
        startActivity(intent)
    }

    fun goToBlue(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Mavi")
        startActivity(intent)
    }

    fun goToYellow(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Sarı")
        startActivity(intent)
    }

    fun goToRed(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Kırmızı")
        startActivity(intent)
    }

    fun goToGreen(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Yeşil")
        startActivity(intent)
    }

    fun goToWhite(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Beyaz")
        startActivity(intent)
    }
}