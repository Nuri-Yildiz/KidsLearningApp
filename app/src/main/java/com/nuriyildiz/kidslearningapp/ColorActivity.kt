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
        finish()
    }

    fun goToBlue(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Mavi")
        startActivity(intent)
        finish()
    }

    fun goToYellow(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Sarı")
        startActivity(intent)
        finish()
    }

    fun goToRed(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Kırmızı")
        startActivity(intent)
        finish()
    }

    fun goToGreen(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Yeşil")
        startActivity(intent)
        finish()
    }

    fun goToWhite(view: View){
        val intent = Intent(applicationContext,ColorDescActivity::class.java)
        intent.putExtra("colorName","Beyaz")
        startActivity(intent)
        finish()
    }
}