package com.example.jc.miprimeraaplicacion

fun main(arg: Array<String>) {

    var hombre: Hombre = Hombre()
    hombre.type

    println(AlumnoDaoImpl.Jugador.nombre)
}

abstract class Persona {

    var type: Int = 23
    abstract fun correr()
    abstract fun salter()
}

interface AlumnoDao {
    fun guardarAlumno()
    fun buscarAlumno()
    fun eliminarAlumno()
}

interface Oficina {
    fun metodo1()
    fun metodo2()
}

class Hombre() : Persona(), Oficina {
    override fun metodo1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun metodo2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun correr() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun salter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class AlumnoDaoImpl : AlumnoDao, Oficina {
    override fun metodo2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun metodo1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun guardarAlumno() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buscarAlumno() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun eliminarAlumno() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class Permiso<T> {
        var datos: String = "sd"
        var nombre: T? = null
    }

    enum class enum {
        Casa(0),
        Oficina(3);

        var indice: Int? = null
        var valor: Int = 9

        constructor(valor: Int) {
            this.indice = valor
        }
    }

    class Jugador{
        companion object {
            val nombre :String = "name"
        }
    }

}