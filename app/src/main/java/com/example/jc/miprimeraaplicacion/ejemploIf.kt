package com.example.jc.miprimeraaplicacion

fun main(arg: Array<String>) {

    var num = 89774519
    var numStr = num.toString()

    var charNum = numStr.toCharArray()
    var charLsst = numStr
    var size = charNum.size

    for(x in 0..size - 2){
        for(y in x +1 .. size -1){
            if(charNum[x] <(charNum[y]))
            {
                var temp = charNum[x]
                charNum[x] = charNum[y]
                charNum[y] = temp
            }
        }
    }
    print("El numero mayor: ")
    print(charNum.joinToString(separator = "", prefix = "[", postfix = "]"))

    /*   var num = 20
       var contador = 0

       for (i in 1..num) {
           contador = 0
           for (j in 1..i) {
               if (i % j != 0)
                   continue
               contador++
           }

           if (contador == 2){
               println("Primo: $i")
           }
       }
   */
    /*var x = 10
    for(y in 0.. x)
        println("y = $y")*/

    /*println("Ingresar el factorial: ")
    var numero = readLine()
    var num = numero!!.toInt()
    var resp = 1
    var x = 1

    while(x <= num){
        resp*= x++
    }*/

    /* for(j in 1..num)
         resp*=j*/

    //println("El factorial es: $resp")

    /*println("Ingrese nota: ")
    var edadStr = readLine()
    var edad : Int = -1

    try {
        edad = edadStr!!.toInt()
    } catch (e: Exception) {

    }*/

    /*if (0 <= edad && edad < 11) println("JALADO")
    else if (11 <= edad && edad < 14) println("REGULAR")
    else if (14 <= edad && edad < 17) println("BUENO")
    else if (17 <= edad && edad < 19) println("EXCELENTE")
    else if (19 <= edad && edad < 21) println("SOBRESALIENTE")*/

    /* when(edad){
         in 0..10 -> println("JALADO")
         in 11..13 -> println("REGULAR")
         in 14..16 -> println("BUENO")
         in 17..18 -> println("EXCELENTE")
         in 19..20 -> println("SOBRESALIENTE")
         else -> println("Data incorrecta")
     }*/
}