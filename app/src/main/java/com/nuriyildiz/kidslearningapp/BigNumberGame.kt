package com.nuriyildiz.kidslearningapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_big_number_game.*
import java.util.*

class BigNumberGame : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_number_game)

        assignNumbersToButtons()
        btnLeft.setOnClickListener {

            checkAnswer(isLeftButtonSelected = true)
            assignNumbersToButtons()
        }

        btnRight.setOnClickListener {

            checkAnswer(isLeftButtonSelected = false)

            assignNumbersToButtons()
        }
    }

    private fun checkAnswer(isLeftButtonSelected: Boolean) {
        val leftNum: Int = btnLeft.text.toString().toInt()
        val rightNum: Int = btnRight.text.toString().toInt()
        val isAnswerCorrect = if(isLeftButtonSelected)leftNum > rightNum else rightNum > leftNum
        if (isAnswerCorrect){
            backgroundView.setBackgroundColor(Color.CYAN)
            Toast.makeText(this, "Doğru!!", Toast.LENGTH_SHORT).show()
            score++
        }else{

            backgroundView.setBackgroundColor(Color.RED)
            Toast.makeText(this, "Yanlış!!", Toast.LENGTH_SHORT).show()
            intent.putExtra("score", score)
            intent = Intent(applicationContext,EndGame::class.java)
            startActivity(intent)

        }
    }

    private fun assignNumbersToButtons() {
        val r = Random()
        val leftnum : Int = r.nextInt(20)
        var rightNum = leftnum
        while(rightNum == leftnum)
            rightNum = r.nextInt(20)
        btnLeft.text = leftnum.toString()
        btnRight.text = rightNum.toString()
    }

}
