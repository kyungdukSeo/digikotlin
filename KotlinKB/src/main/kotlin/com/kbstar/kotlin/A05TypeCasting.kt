package com.kbstar.kotlin

// A05TypeCasting.kt

fun main() {
    val a: Int = 1;
    // val b: Double = a
    // val c:Int = 1.1

    // AllType Casting
    val b:Double = a.toDouble()
    println("b = ${b}")

    val d = 1L + 3
    println("d = ${d}")

    /*
        형변환 관련 메소드
        toByte(), toLong(), toShort(), toInt()
        toFloat(), toDouble()
        toChar()
     */

    // Smart Cast : Number
    var no : Number = 123       // int
    println("no = ${no}")

    no = 1.23                   // double
    println("no = ${no}")

    no = 1234L                  // long
    println("no = ${no}")

    no = no + 1.23F             // float
    println("no = ${no}")


    // 자료형(Data Type) 검사
    val age = 12                // int
    if(age is Int)
        println(age)
    else if (age !is Int)
        println("Not an Int")


    // Any Type
    var any : Any = "Hello World"
    println("any = ${any}")

    any = 123
    println("any = ${any}")

    if(any is Int)
        println("any is an Int : ${any}")

    any = "Kotlin World"
    if(any is String)
        println("any is a String , length = ${any.length} , ${any}")

//    any = 123
    val myValue : String = any as String
    println("myValue = ${myValue}")

    println("type of myValue = ${myValue.javaClass}")

    any = 123
    println("type of any = ${any.javaClass}")

    any = 123L
    println("type of any = ${any.javaClass}")

    any = 123.4
    println("type of any = ${any.javaClass}")


    test(3,4)

}

fun test(a:Any, b:Any)
{
    println("I am test()")
    var sum = 0;

    if(a is Int && b is Int)
    {
        sum = a+b;
        println("sum = ${sum}")

    }

}

