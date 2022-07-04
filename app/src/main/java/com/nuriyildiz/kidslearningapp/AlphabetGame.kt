package com.nuriyildiz.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AlphabetGame : AppCompatActivity() {
    var score = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_game)

        score = intent.getIntExtra("score" , 0)
        count = intent.getIntExtra("count" , 0)
        var random = (1..21).random()

        val letterSelector = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z")
        val letters = arrayOf(letterSelector[random],letterSelector[random-1],letterSelector[random+1])
        val answers = arrayOf(letters[0],letterSelector[(0..22).random()],letterSelector[(0..22).random()],letterSelector[(0..22).random()])
        answers.shuffle()

        val scoreText = findViewById<TextView>(R.id.scoreText)
        scoreText.setText(score.toString())

        val textview2 = findViewById<TextView>(R.id.letterText1)
        textview2.setText(letters[1])

        val textview3 = findViewById<TextView>(R.id.letterText2)
        textview3.setText(letters[2])

        val option1 = findViewById<Button>(R.id.greenBtn)
        option1.setText(answers[0])

        val option2 = findViewById<Button>(R.id.greenBtn2)
        option2.setText(answers[1])

        val option3 = findViewById<Button>(R.id.greenBtn3)
        option3.setText(answers[2])

        val option4 = findViewById<Button>(R.id.whiteBtn)
        option4.setText(answers[3])

        option1.setOnClickListener {
            onCorrect(answers[0], letters[0])
        }
        option2.setOnClickListener {
            onCorrect(answers[1], letters[0])
        }
        option3.setOnClickListener {
            onCorrect(answers[2], letters[0])
        }
        option4.setOnClickListener {
            onCorrect(answers[3], letters[0])
        }
    }


    private fun onCorrect(answer: String, trueAnswer: String) {
        if (answer.equals(trueAnswer)){
            score++
            count++
            intent.putExtra("count", count)
            intent.putExtra("score", score)
            finish()
            startActivity(intent)
        }else{
            count++
            finish()
            startActivity(intent)
        }

    }
}