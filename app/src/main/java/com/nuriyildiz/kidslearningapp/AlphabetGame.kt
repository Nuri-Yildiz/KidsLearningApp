package com.nuriyildiz.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlphabetGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_game)


        var random = (1..21).random()
        val letterSelector = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z")
        val letters = arrayOf(letterSelector[random],letterSelector[random-1],letterSelector[random+1])
        val answers = arrayOf(letters[0],letterSelector[(0..22).random()],letterSelector[(0..22).random()],letterSelector[(0..22).random()])
        answers.shuffle()
        val option1 = findViewById<Button>(R.id.greenBtn)
        val option2 = findViewById<Button>(R.id.greenBtn2)
        val option3 = findViewById<Button>(R.id.greenBtn3)
        val option4 = findViewById<Button>(R.id.whiteBtn)
        var score = 0
        var count = 0





    }
}