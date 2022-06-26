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

    fun openLetterA(view: View){
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
    fun openLetterB(view: View){
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.fish)
        view.bfText.text = "Balığın B'si"
        view.bfImage2.setImageResource(R.drawable.ic_lion)
        view.bfText2.text = "Aslanın A'sı"
        view.bfText3.text = "Ağacın A'sı"
        view.bfImage3.setImageResource(R.drawable.green1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterC(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterCc(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()

    }
    fun openLetterD(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterE(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterF(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterG(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterGg(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribeH(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterI(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterIi(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }

}