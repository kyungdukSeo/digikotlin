package com.kbstar.kotlin

// A11CallByName.kt
// Function Pointer 로 호출


fun main() {
    val result = callByName(myFunc)

}

fun callByName( b: () -> Boolean ) : Boolean {
    println("I am callByName()")
    return b()
}

val myFunc: () -> Boolean = {
    println("I am myFunc()")
    true
}