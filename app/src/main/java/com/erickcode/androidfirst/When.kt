package com.erickcode.androidfirst

    fun main(){
//        getMonth(2)
//        getTrimestre(2)
//        getSemestre(1)
        resultado(true)
    }
    fun resultado(value:Any){
        when(value){
            is Int -> value + value
            is String -> println(value)
            is Boolean -> if(value) println("Hola mundo")
        }
    }

//Para colocar los rangos de debe poner 1..6 y las flechas se haran solas
    fun getSemestre(semestre: Int): String{
         val result = when(semestre) {
            in 1..6 -> return "Primer semestre"
            in 7..12 -> return "Segundo semestre"
            !in 1..12 -> return "Tercer semestre"
             else -> "Hola mundo de nuevo"
        }
    return result
}
    fun getTrimestre(trimestre: Int){
        when(trimestre){
            1, 2, 3 -> println("Primer trimestre")
            4, 5, 6 -> println("Segundo trimestre")
            7, 8, 9 -> println("Tercer trimestre")
            10, 11, 12 -> println("Cuarto trimestre")
            else -> println("numero no valido")
        }
    }
    fun getMonth(month: Int){
        when(month){
            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> println("Abril")
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
            else -> println("Numero no valido!")
        }
    }

