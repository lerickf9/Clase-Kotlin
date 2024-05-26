package com.erickcode.androidfirst.exercise
/*
    calcule los precios de estas entradas basado en la edad.

    * Un precio de entrada infantil USD 15 para personas de 12 años o menos.
    * Un precio de entrada estandar de USD 30 para personas de entre 13 y 60 años los lunes, un precio
    estandar con descuento de USD 25 para el mismo grupo etario
    * Un precio para adultos mayores de USD 20 para personas 61 años o más (asumimos que la edad máxima
    de un espectador de 100 años)
    * Un valor de -1 para indicar que el precio no es valido cuando un usuario ingresa una edad fuera
    de las especificaciones.
 */

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("El boleto a pagar del niño es: ${ticketPrice(child, isMonday)}")
    println("El boleto a pagar del adulto es: ${ticketPrice(adult, isMonday)}")
    println("El boleto a pagar del adulto mayor es: ${ticketPrice(senior, isMonday)}")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var entrada = 0
    when (age) {
        in 0..12 -> entrada = 15
        in 13..60 -> if (isMonday){ entrada = 25}else entrada = 30
        in 61..100 -> entrada = 20
        else -> entrada = -1
    }
    return entrada
}