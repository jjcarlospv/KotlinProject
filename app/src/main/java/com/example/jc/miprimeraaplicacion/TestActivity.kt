package com.example.jc.miprimeraaplicacion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Toast

class TestActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        var myToast = Toast.makeText(this, getString(R.string.msg), Toast.LENGTH_SHORT)
        myToast.setGravity(Gravity.RIGHT, 0, 0)
    }
}

