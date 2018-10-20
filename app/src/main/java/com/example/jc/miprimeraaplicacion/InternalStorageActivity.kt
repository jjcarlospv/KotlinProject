package com.example.jc.miprimeraaplicacion

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_card_view.*
import kotlinx.android.synthetic.main.activity_internal_storage.*

class InternalStorageActivity : AppCompatActivity() {

    val PREF = "myPrefs"
    val EXTRA = "misNombres"
    var myPref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internal_storage)

        myPref = getSharedPreferences(PREF, Context.MODE_PRIVATE)
        var editor = (myPref as SharedPreferences).edit()
        txtResultado.text = ""

        btnAlmacenar.setOnClickListener{

            if(!TextUtils.isEmpty(txtNombre.text))
                editor.putString(EXTRA, txtNombre.text.toString()).commit()
            else{
                var snack = Snackbar.make(findViewById(R.id.constraint), "No hay Nombre", Snackbar.LENGTH_SHORT).setAction(""){}
                    snack.show()
            }
        }

        var tt = (myPref as SharedPreferences).getString(EXTRA, "No hay datos")
        txtResultado.text = tt
    }
}
