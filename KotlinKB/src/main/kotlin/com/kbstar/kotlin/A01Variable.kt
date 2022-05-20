package com.kbstar.kotlin

import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro: String = "Hello";
    // final String intro = "Hello";
    val age: Int = 12;

    // intro = Hello, age = 12`
    println("intro = ${intro} , age = ${age}")
    println("intro = " + intro + ", age = ${age}")

    println(PI)
    println(abs(-12.34))

    val taxi = A02Car("taxi", 3)
    // Car taxi = new Car("taxi", 3);
    println(taxi.name);
    println(taxi.color);

    // taxi.name = taxi
    println("taxi.name = ${taxi.name}")
    println("taxi.color = ${taxi.color}")

    var bus = A02Car("bus", 1)
    bus = A02Car("new bus", 7)

    val truck: A02Car = A02Car("truck", 4)


}