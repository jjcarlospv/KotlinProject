package com.example.jc.miprimeraaplicacion

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PersonaListAdapter(private val list: ArrayList<Person>,
                         private val context: Context): RecyclerView.Adapter<PersonaHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonaHolder {
        return PersonaHolder(LayoutInflater.from(p0.context).inflate(R.layout.activity_card_view, p0, false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: PersonaHolder, p1: Int) {

        p0.bindItem(list.get(p1))
    }

}

class PersonaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(persona: Person){

        var nombres = itemView.findViewById<TextView>(R.id.txtNombres)
        var apellidos = itemView.findViewById<TextView>(R.id.txtNombres)
        nombres.text = persona.nombres
        apellidos.text = persona.apellidos
    }
}