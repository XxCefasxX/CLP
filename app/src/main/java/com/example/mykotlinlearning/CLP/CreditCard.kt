package com.example.mykotlinlearning.CLP

import java.util.*

fun main() {
    val cardNumber = "4155,2798,6045,1237"
    val cardExpDate = "10/24"
    val validate = { number: String, exp: String ->
       if( cardNumberValidator(cardNumber)&&
           validCardDate(cardExpDate))
           println(true)
        else
           println(false)
    }
    validate(cardNumber,cardExpDate)

}

fun validCardDate(date: String): Boolean {
    val specialDig = listOf("-", "/", ",", ".", " ")
    var expDate = date
    for (d in specialDig) {
        expDate = expDate.replace(d, "")
    }
    var valid = false
    if (expDate.length < 4) return valid

    val m = expDate.substring(0, 2)
    val y = expDate.substring(2, 4)
    val month = m.toInt()
    val year = ("20"+y).toInt()
    val calendar: Calendar = Calendar.getInstance()
    val currentYear: Int = calendar.get(Calendar.YEAR)
    val currentMonth: Int = calendar.get(Calendar.MONTH)
    if (month > 12) valid = false
    if (year < currentYear) valid = false
    else if (year == currentYear && month < currentMonth) valid = false
    else valid = true
    return valid
}

fun cardNumberValidator(input: String): Boolean {
    var cardNumber = input
    val regex = "[0-9]{16}".toRegex()
    val specialDig = listOf("-", "/", ",", ".", " ")
    for (d in specialDig) {
        cardNumber = cardNumber.replace(d, "")
    }
    return cardNumber.matches(regex)
}