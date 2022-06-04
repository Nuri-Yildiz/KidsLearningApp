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
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe2(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe3(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe4(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe5(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe6(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe7(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe8(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe9(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openDescribe10(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        dialog.setContentView(view)
        dialog.show()
    }
}