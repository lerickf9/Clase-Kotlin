package com.erickcode.androidfirst.syntaxis

fun main(){
    //lista no puede inmutar: solo tiene un tamaño
//    inmutableList()
    mutalbe()
}
fun mutalbe(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(weekDays)

    weekDays.add("Sabado")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No imprime nada pq no hay
    }else{
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    weekDays.add(0, "Sunday")
    println(weekDays)

    weekDays.forEach{ println(it) }

}

fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly[0])
//    println(readOnly.last())
//    println(readOnly.first())

    val example = readOnly.filter { it.contains("Ju") }
    println(example)

    readOnly.forEach{ weekday -> println(weekday) }
}