package com.nuriyildiz.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.*
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.bfImage
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.bfText
import kotlinx.android.synthetic.main.bottom_sheet_fragment2.view.*

class AlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)
    }

    fun openLetter1(view: View){
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        view.bfText.text = "Arabanın A'sı"
        view.bfImage2.setImageResource(R.drawable.ic_lion)
        view.bfText2.text = "Aslanın A'sı"
        view.bfText3.text = "Ağacın A'sı"
        view.bfImage3.setImageResource(R.drawable.green1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter2(view: View){
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        view.bfImage2.setImageResource(R.drawable.lion)
        view.bfText2.text = "Aslanın A'sı"
        view.bfText.text = "Arabanın A'sı"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter3(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter4(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter5(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter6(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter7(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter8(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe9(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetter10(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }

}