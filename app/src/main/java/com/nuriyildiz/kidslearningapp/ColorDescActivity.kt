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
        var imgs = listOf<Int>();

        when(colorName){
            "Siyah" -> imgs = listOf<Int>(R.drawable.black1,R.drawable.black2,R.drawable.black3)

            "Mavi" -> imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow1,R.drawable.yellow1)

            "Sarı" -> imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow2,R.drawable.yellow3)

            "Kırmızı" -> imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow1,R.drawable.yellow1)

            "Yeşil" -> imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow1,R.drawable.yellow1)

            "Beyaz" -> imgs = listOf<Int>(R.drawable.yellow1,R.drawable.yellow1,R.drawable.yellow1)

            else -> textView2.text="Çalışmadı"
        }

        var adapter = Adapter(imgs, this)
        pager.adapter = adapter

    }
}