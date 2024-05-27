package com.erickcode.androidfirst.syntaxis

fun main(){
    var name:String = "Lunes"
    var name2:String = "Martes"
    var name3:String = "Miercoles"
    var name4:String = "Jueves"
    var name5:String = "Viernes"
    var name6:String = "Sabado"
    var name7:String = "Domingo"

    val weekDays = arrayOf(name, name2, name3, name4, name5, name6, name7)

    //Tamaños

    println(weekDays.size)

    if(weekDays.size >= 8){

    }
    println(weekDays[1])

    //Bucles para arrys

    for (position in weekDays.indices){
//        println("He pasado por aqui $position")
//        println(weekDays[position])
    }

    for((position, value ) in weekDays.withIndex()){
//        println("la position $position, contiene $value")
    }

    for(weekDays in weekDays){
        println(weekDays)
    }
}