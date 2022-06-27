package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Red : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_red)

        val title = findViewById<TextView>(R.id.textView)
        val scoreText = findViewById<TextView>(R.id.scoreText)
        val green = findViewById<Button>(R.id.greenBtn)
        val white = findViewById<Button>(R.id.whiteBtn)
        val yellow = findViewById<Button>(R.id.yellowBtn)
        val blue = findViewById<Button>(R.id.blueBtn)
        val black = findViewById<Button>(R.id.blackBtn)
        val red = findViewById<Button>(R.id.redBtn)
        val restart = findViewById<Button>(R.id.restartBtn)
        val activitiesArray = arrayOf(Green::class.java, Yellow::class.java, Blue::class.java, Red::class.java, White::class.java, Black::class.java)

        // Get count, index and color from intent
        var score = intent.getIntExtra("score", -2)
        var count = intent.getIntExtra("count", -3)
        val colors = intent.getStringArrayListExtra("colors")

        scoreText.text = score.toString()

        if(score != count){
            val temp = "Renk: " + (count + 1) + ". Renk "
            title.text = temp
        } else {
            val temp = "Renk " + (colors?.get(count) ?: String)
            title.text = temp
        }

        // Play lost or won the game
        fun gameOver(newTitle: String){
            colors?.set(count, newTitle)
            title.text = newTitle
            restart.visibility = View.VISIBLE
            red.text = newTitle
            yellow.text = newTitle
            green.text = newTitle
        }
        fun onCorrect(answer: String, classNum: Int){
            if (colors?.get(count) ?:  String == answer){
                val intent = Intent(this@Red, activitiesArray[classNum])
                if (colors != null) {
                    if((count+1) == colors.size){
                        gameOver("Kazandın")
                    } else {
                        if (count == score) {
                            count = -1
                            score++
                        }
                        count++
                        intent.putStringArrayListExtra("colors", colors)
                        intent.putExtra("count", count)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    }
                }
            }
            else if(restart.visibility != 0){
                gameOver("Oyun Bitti")
            }
        }

        // On click listeners for each button
        green.setOnClickListener {
            onCorrect("Yeşil", 0)
        }
        yellow.setOnClickListener {
            onCorrect("Sarı", 1)
        }
        blue.setOnClickListener {
            onCorrect("Mavi", 2)
        }
        red.setOnClickListener {
            onCorrect("Kırmızı", 3)
        }
        black.setOnClickListener {
            onCorrect("Siyah", 4)
        }
        white.setOnClickListener {
            onCorrect("Beyaz", 5)
        }
        restart.setOnClickListener {
            val intent = Intent(this@Red, MainActivity::class.java)
            startActivity(intent)
        }
    }
}