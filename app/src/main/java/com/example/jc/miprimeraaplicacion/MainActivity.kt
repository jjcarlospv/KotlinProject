package com.example.jc.miprimeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val x = 0
    var y: Integer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cb1.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked)
                System.out.println("TRUE")
            else
                System.out.println("FALSE")
        }

    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
    }

    fun clickEvent(view: View) {

        when {
            rgMenuEntrada.rbOption1.isChecked -> tvChose.text = rgMenuEntrada.rbOption1.text
            rgMenuEntrada.rbOption2.isChecked -> tvChose.text = rgMenuEntrada.rbOption2.text
            rgMenuEntrada.rbOption3.isChecked -> tvChose.text = rgMenuEntrada.rbOption3.text
        }
    }

    fun mostrarEntrada(view:View){

    }
    fun mostrarFondo(view:View){

    }
}
