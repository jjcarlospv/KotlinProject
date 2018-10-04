package com.example.jc.miprimeraaplicacion

fun main(arg : Array<String>){

    factorial()
}

fun factorial(){

    var numero : Int = readLine()!!.toInt()
    var resultado = 1
    for(x in 1..numero){
        resultado*= x
    }
    println("El factorial es  $resultado")
}