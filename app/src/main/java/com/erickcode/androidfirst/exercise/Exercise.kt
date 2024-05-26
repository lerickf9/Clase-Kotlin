package com.erickcode.androidfirst.exercise

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

}

fun printNotificationSummary(numberOfMessage: Int){
    if(numberOfMessage >= 100)
        println("Your phone is blowing up! You have 99+ notifications")
    else{
        println("You have $numberOfMessage notifications.")
    }
}