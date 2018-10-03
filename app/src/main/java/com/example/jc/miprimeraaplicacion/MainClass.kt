package com.example.jc.miprimeraaplicacion

var valor = 100
var num : Int = 8
var bb : Boolean = true
var value : Float = 45.6f
var myArray = arrayOf("jean", " mary")
var myArr :  IntArray = intArrayOf(3,3)




fun main(arg: Array<String>){
    valor = 44
    println("ingrese nombre")
    var nombre = readLine()
    println("Hola mundo $nombre")
    println("suma ${valor.times(3)}")
}

