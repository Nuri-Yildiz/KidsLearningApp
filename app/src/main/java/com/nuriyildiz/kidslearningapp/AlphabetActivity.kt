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
        view.bfImage2.setImageResource(R.drawable.bicycle)
        view.bfText2.text = "Bisikletin B'si"
        view.bfText3.text = "Balonun B'si"
        view.bfImage3.setImageResource(R.drawable.balloon)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterC(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.jacket)
        view.bfText.text = "Ceketin C'si"
        view.bfImage2.setImageResource(R.drawable.witch)
        view.bfText2.text = "Cadının C'si"
        view.bfImage3.setImageResource(R.drawable.gazelle)
        view.bfText3.text = "Ceylanın C'si"
        dialog.setContentView(view)
        dialog.show()
    }

    fun openLetterD(view: View){
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.tooth)
        view.bfText.text = "Dişin D'si"
        view.bfImage2.setImageResource(R.drawable.mountain)
        view.bfText2.text = "Dağın D'si"
        view.bfImage3.setImageResource(R.drawable.sea)
        view.bfText3.text = "Denizin D'si"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterE(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.donkey)
        view.bfText.text = "Eşşeğin E'si"
        view.bfImage2.setImageResource(R.drawable.home)
        view.bfText2.text = "Evin E'si"
        view.bfImage3.setImageResource(R.drawable.hand)
        view.bfText3.text = "Elin E'si"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterF(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.flute)
        view.bfText.text = "Flütün F'si"
        view.bfImage2.setImageResource(R.drawable.elephant)
        view.bfText2.text = "Filin F'si"
        view.bfImage3.setImageResource(R.drawable.mouse)
        view.bfText3.text = "Farenin F'si"
        dialog.setContentView(view)
        dialog.show()

    }
    fun openLetterG(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.pigeon)
        view.bfText.text = "Güvercinin G'si"
        view.bfImage2.setImageResource(R.drawable.ship)
        view.bfText2.text = "Geminin G'si"
        view.bfImage3.setImageResource(R.drawable.deer)
        view.bfText3.text = "Geyiğin G'si"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterH(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.roof)
        view.bfText.text = "Horozun H'si"
        view.bfImage2.setImageResource(R.drawable.referee)
        view.bfText2.text = "Hakemin H'si"
        view.bfImage3.setImageResource(R.drawable.turkey)
        view.bfText3.text = "Hindinin H'si"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterI(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment2, null)
        view.bfImage.setImageResource(R.drawable.river)
        view.bfText.text = "Irmağın I'sı"
        view.bfImage2.setImageResource(R.drawable.witch)
        view.bfText2.text = "Cadının C'si"
        view.bfImage3.setImageResource(R.drawable.gazelle)
        view.bfText3.text = "Ceylanın C'si"
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterJ(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterK(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterL(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterM(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterN(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterO(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterP(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterR(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterS(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterU(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterV(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterY(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }
    fun openLetterZ(view: View){

        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)
        view.bfImage.setImageResource(R.drawable.blue1)
        dialog.setContentView(view)
        dialog.show()
    }



}