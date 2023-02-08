package com.example.mykotlinlearning


/*
* Extension function -> extend the functionality without having to inherit the class
* */


class Circle(
    val radius: Double
) {

    fun area(): Double {
        return Math.PI * radius * radius
    }

}

fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun Circle.perimeterTest() = 2 * Math.PI * radius


fun main() {
    val circle = Circle(3.5)

    println("Radius   : ${circle.radius}")
    println("Area     : ${circle.area()}")

    println("Perimeter: ${circle.perimeter()}")
}