package com.kbstar.kotlin

// A13Homework.kt

fun main() {

    // 매개변수가 없는경우
    val kbGreet : () -> Unit = { println("Hello kbGreet!") }
    println("----------kbGreet----------")
    kbGreet()
    // println("kbGreat() : ${kbGreet()}")

    // 매개변수가 1개인 경우
    var variable = 2;

    val kbSquare : (Int) -> Int = { a -> a * a }
    println("----------kbSquare----------")
    println("a : ${variable}, a * a = ${kbSquare(variable)}")

    // 매개변수가 2개인 경우
    println("----------kbOperator----------")

    val kbAdder : (Int, Int) -> Int = { a:Int, b:Int -> a + b }
    val kbSubtractor : (Int, Int) -> Int = { a:Int, b:Int -> a - b }
    val kbMultiplier : (Int, Int) -> Int = { a:Int, b:Int -> a * b }
    val kbDivider : (Int, Int) -> Int = { a:Int, b:Int -> a / b }

    var x = 10;
    var y = 5;

    var kbOperator = kbAdder
    println("x : ${x}, y : ${y}")
    println("kbOperator : +     result = " + kbOperator(x,y))
    kbOperator = kbSubtractor
    println("kbOperator : -     result = " + kbOperator(x,y))
    kbOperator = kbMultiplier
    println("kbOperator : *     result = " + kbOperator(x,y))
    kbOperator = kbDivider
    println("kbOperator : /     result = " + kbOperator(x,y))

}

/*
============출력 결과===========

----------kbGreet----------
Hello kbGreet!
----------kbSquare----------
a : 2, a * a = 4
----------kbOperator----------
x : 10, y : 5
kbOperator : +     result = 15
kbOperator : -     result = 5
kbOperator : *     result = 50
kbOperator : /     result = 2

 */