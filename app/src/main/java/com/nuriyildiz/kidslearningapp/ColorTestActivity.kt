package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ColorTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_test)


        var random = (0..5).random()
        val colorSelector = arrayOf("Siyah","Beyaz","Sarı","Mavi","Kırmızı","Yeşil")
        val colors : ArrayList<String> = arrayListOf(colorSelector[random])
        val start = findViewById<Button>(R.id.startBtn)
        val activitiesArray = arrayOf(Green::class.java, Black::class.java , Yellow::class.java, White::class.java , Blue::class.java, Red::class.java)

        for(i in 0..5){
            random = (0..5).random()
            colors.add(colorSelector[random])
        }


        start.setOnClickListener {
            val intent = Intent(this@ColorTestActivity, activitiesArray[random])
            intent.putStringArrayListExtra("colors", colors)
            intent.putExtra("count", 0)
            intent.putExtra("score", 0)
            startActivity(intent)
        }
    }
}