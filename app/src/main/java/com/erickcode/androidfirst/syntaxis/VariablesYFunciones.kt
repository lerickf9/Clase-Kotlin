package com.erickcode.androidfirst.syntaxis

val age: Int = 31
fun main() {
    showMyName("Erick")
    showMyAge(31)
    add(26,25)
    val mySubstract = substract(10,5)
    println(mySubstract)
}

fun substract2(firstNumber: Int, secondNumber: Int) = firstNumber-secondNumber

fun substract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber-secondNumber
}
fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun showMyName(name: String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun variablesAlfaNumericas() {

    variablesNumbericas()
    /*
    * Variables alfanumericas
    * */

    //Char
    val charExample: Char = 'a'
    val charExample2: Char = '2'
    val charExample3: Char = '%'

    //String
    val stringExample: String = "Soy un String"
    val stringExample2 = "Soy un segundo String"


//    print(stringExample)
//    print(boleanExample)
//    print(doubleExample)
    /*
        println("Sumar: " + (age + age2))
        println("Restar: " + (age - age2))
        println("Multiplicaion: " + (age * age2))
        println("Division: " + (age/age2))
        println("Modulo: " + (age % age2))
    */
    //cambiar la variable de float a int con .toInt()
//    var example3 = age + floatExample.toInt()
//    println(example3)

    //Concatenar String
    var stringExample1 = "2"
    var stringExample3 = "3"
//    println(stringExample1 + stringExample3)
//    println(stringExample1.toInt() + stringExample3.toInt())
    var stringNombre = "Erick"
    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo "
//    println(stringConcatenada)
    println("Hola me llamo $stringNombre y tengo $age años de edad")
}

fun varablesBoolean() {
    /*
    * Variables boolean
    * */
    val boleanExample: Boolean = true
    val boleanExample2: Boolean = false

}

fun variablesNumbericas() {
    /*
    Variables Numericas
     */
    val age2 = 31
    //Int -2.147.483.647 a 2.147.483.647

//    println(age2)
//    println(age2)

    //Long > Int  -9.223.036.854.775.807 a 9.223.036.854.775.807
    val example: Long = 30000;

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 30.5565545
}
