package com.example.sosphone

class ClaseA {

    private var identificador : Int = 0
    private var nombre : String = ""
    private var edad : Int = 0

    constructor(edad: Int, nombre: String, identificador: Int) {
        this.edad = edad
        this.nombre = nombre
        this.identificador = identificador
    }

    override fun toString(): String {
        return "ClaseA(identificador=$identificador, nombre='$nombre', edad=$edad)"
    }
}