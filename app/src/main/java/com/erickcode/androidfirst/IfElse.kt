package com.erickcode.androidfirst

fun main() {
//    ifBasico()
    ifAnidado()
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false

    //Condicionales && ||
    if(age >= 18 && parentPermission==true){
        println("Tienes permiso")
    }else{
        println("No tienes permiso")
    }
}

fun ifInt() {
    var age = 31
    if (age >= 18) {
        print("Beber una cerveza")
    } else {
        print("Beber jugo")
    }
}

fun ifBoolean() {
    var soyFeliz = true

    //Sin nada es true
    //! Con exclamacion al prinicpio niega la condicion

    if (!soyFeliz) {
        print("Estoy triste")
    }

}

fun ifAnidado() {
    val animal = "dog"
    if (animal == "dog") {
        println("Este es un perro")
    } else if (animal == "cat") {
        println("Este es un gato")
    } else if (animal == "bird") {
        println("Este es un pajaro")
    } else {
        println("Este no es un animal")
    }
}

fun ifBasico() {
    val name = "Erick"
    //Minuscula = lowercase() Mayuscula = Uppecase()
    if (name.lowercase() == "erick") {
        println("Oye la variable name = 'Erick'")
    } else {
        println("Este no es Erick")
    }

}