package com.kbstar.kotlin

// A08HighLevel.kt
// 함수 속에 함수가 포함되어있는 함수 : 고차함수

// 같은 package에 같은 함수가 있으면 error -> sum2로 이름 짓는다..
fun sum2(a: Int, b: Int) = a + b
fun multi2(a: Int, b: Int) = a * b
fun second() : Int {
    return sum2(3,4)
}

/*
fun sum2(a: Int, b: Int) : Int
{
    return a + b
}
 */

fun main() {
    val result1: Int = sum2(1,2)
    val result2: Int = multi2(sum(1,2), sum(3,4))

    println("result1 = ${result1}, result2 = ${result2}")

    println("result1 = " + sum2(1,2))
    println("result1 = ${sum2(1,2)}")


}