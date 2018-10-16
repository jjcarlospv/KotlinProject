package com.example.jc.miprimeraaplicacion

import java.io.Serializable

class Dato : Serializable{

    var nombres: String? = null
    var apellidos: String? = null

    constructor(nombres: String, apellidos:String){
        this.nombres = nombres
        this.apellidos = apellidos
    }
}