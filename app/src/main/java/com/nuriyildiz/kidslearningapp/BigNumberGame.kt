package com.nuriyildiz.kidslearningapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_big_number_game.*
import java.util.*

class BigNumberGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_number_game)

        assignNumbersToButtons()
        btnLeft.setOnClickListener {
//            code here will run everytime the left button in clicked
            checkAnswer(isLeftButtonSelected = true)
            assignNumbersToButtons()
        }

        btnRight.setOnClickListener {
//            1. Compare the numbers in the boxes
            checkAnswer(isLeftButtonSelected = false)
//            2. Pick new random numbers
            assignNumbersToButtons()
        }
    }

    private fun checkAnswer(isLeftButtonSelected: Boolean) {
        val leftNum: Int = btnLeft.text.toString().toInt()
        val rightNum: Int = btnRight.text.toString().toInt()
        val isAnswerCorrect = if(isLeftButtonSelected)leftNum > rightNum else rightNum > leftNum
        if (isAnswerCorrect){
//                Correct answer!!
//                Change the background color
            backgroundView.setBackgroundColor(Color.CYAN)
//                Show a toast
            Toast.makeText(this, "CORRECT!!", Toast.LENGTH_SHORT).show()
        }else{
//                Wrong answer!!
            backgroundView.setBackgroundColor(Color.RED)
            Toast.makeText(this, "WRONG!!", Toast.LENGTH_SHORT).show()
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
