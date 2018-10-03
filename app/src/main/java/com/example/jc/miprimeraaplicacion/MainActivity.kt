package com.example.jc.miprimeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val x = 0
    var y : Integer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "",Toast.LENGTH_SHORT).show()
    }

    fun btnEvent(view: View){
        Toast.makeText(this, "BTN TEST",Toast.LENGTH_SHORT).show()
    }
}
