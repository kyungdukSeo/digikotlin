package com.kbstar.kotlin

fun main() {
    /*
    Number, Any -> When
     */

    cases(1)
    cases("hello")
    cases(123L)
    cases(123)
    cases('A')
    cases(123.4)
    cases(123.9F)
    cases(true)
    cases("String Test")



}

fun cases(obj : Any)
{
    when(obj)
    {
        1 -> println("Int : ${obj}")
        "hello" -> println("String : ${obj}")
        is Long -> println("Long : ${obj}")
        is Int -> println("Int : ${obj}")
        is Double -> println("Double : ${obj}")
        is Float -> println("Float : ${obj}")
        is Boolean -> println("Boolean : ${obj}")

        !is String -> println("Not a String")

        else -> println("Unknown")

        /*
        1 은 1, Int 에 모두 걸리지만 아래는 출력하지 않음
            -> Switch 문 처럼 위에서 하나 걸리면 빠져나감
         */
    }



}