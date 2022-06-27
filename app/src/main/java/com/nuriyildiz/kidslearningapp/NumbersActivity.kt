package com.nuriyildiz.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.*

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
    }

    fun openDescribe1(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand1)
        view.bfText.text = "Bir"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe2(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand2)
        view.bfText.text = "İki"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe3(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand3)
        view.bfText.text = "Üç"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe4(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand4)
        view.bfText.text = "Dört"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe5(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand5)
        view.bfText.text = "Beş"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe6(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand6)
        view.bfText.text = "Altı"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe7(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand7)
        view.bfText.text = "Yedi"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe8(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand8)
        view.bfText.text = "Sekiz"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe9(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand9)
        view.bfText.text = "Dokuz"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe10(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.hand10)
        view.bfText.text = "On"
        dialog.setContentView(view)
        dialog.show()
    }
}