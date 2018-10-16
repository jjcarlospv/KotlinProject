package com.example.jc.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_second.*
import java.io.Serializable


class IntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        var nombres: Array<String> = arrayOf("Sting", "Christian", "Jose", "Davis", "Eslis", "Mary", "Jean",
                "", "", "", "")

        var nombreAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres)
        lstNombres.adapter = nombreAdapter
    }

    fun enviarSecondAtivity(view: View) {
        var myIntent = Intent(this, SecondActivity::class.java)
        myIntent.putExtra("nombres", etNames.text.toString())
        var dato = Dato("Jeancarlos", "Paucar")
        myIntent.putExtra("dato", dato as Serializable)
        startActivity(myIntent)
    }
}