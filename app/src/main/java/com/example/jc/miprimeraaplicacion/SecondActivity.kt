package com.example.jc.miprimeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if(intent != null){
            var name =  intent.getStringExtra("nombres")
            var dato = intent.getSerializableExtra("dato") as Dato
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        }

        var lstPerson = ArrayList<Person>()
        var pp = Person()
        pp.nombres = "jeancarlos"
        pp.apellidos = "Paucar"
        lstPerson.add(pp)

        pp = Person()
        pp.nombres = "Jose"
        pp.apellidos = "Villalobos"
        lstPerson.add(pp)

        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvNombres.layoutManager = layoutManager

        var personAdapter = PersonaListAdapter(lstPerson, this)
        rvNombres.adapter = personAdapter
    }
}
