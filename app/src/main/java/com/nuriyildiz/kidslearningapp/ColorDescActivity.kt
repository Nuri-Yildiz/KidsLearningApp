package com.nuriyildiz.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_color_desc.*

class ColorDescActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_desc)
        val intent=intent
        var colorName = intent.getStringExtra("colorName")
        textView2.text = colorName
        /*
        when(colorName){
            "Siyah" -> textView2.text = "blaack"

            "Sarı" -> textView2.text="Yellow"

            else -> textView2.text="Çalışmadı"
        }
         */
        var imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow1,R.drawable.yellow1)
        var adapter = Adapter(imgs, this)
        pager.adapter = adapter

    }
}