package com.kbstar.kotlin

// A06Operator.kt

fun main() {
    /*
    Operator
    산술연산자 : + - * / %
    대입연산자 : = += -= *= /= %=
    증감연산자 : ++ -- a++ --a

    a = 3
                    출력     값
    println(a++)    3       4
    println(a)      4       4
    println(--a)    3       3
    println(a)      3       3

    비교연산자
        >, <, >=, <=, ==, ===, !=, !==
    논리연산자 : if 속에 들어가는 연산
        &&, ||, !
    비트연산자
        << >>
        4.shl(2) : 4를 shift left 2 해라


     */

    var no1 = 10
    var no2 = 10
    var result1 = ++no1;
    var result2 = no2--;

    println("result1 = ${result1} , ${no1}")
    println("result2 = ${result2} , ${no2}")

    var x = 4   // 100
    var y = 0b0000_1010
    var z = 0x0F        // 0000 1111

    println("x shl 2 = ${x shl 2}")
    //    println("  : ${y}")
    println("x.inv() = ${x.inv()}")
    // 0000 0000    0000 0000   0000 0000   0000 0100
    // 1111 1111    1111 1111   1111 1111   1111 1011
    println("y.shr 2 = ${y shr 2} or ${y/4}")
    println("y.shl 4 = ${y shl 4} or ${y*16}")


    no1 = 12;
    no2 = 25;
    var result :Int
    result = no1 or no2 // no1 || no2
    println("result = ${result}")



}