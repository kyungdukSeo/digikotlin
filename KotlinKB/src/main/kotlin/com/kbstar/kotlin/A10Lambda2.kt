package com.kbstar.kotlin

// A10Lambda2.kt
// Call by Value
/*
    void printCar(obj)
    {

    }

    main()
    {
        Car taxi = new Car();
        int[] lotto = new int[6];
        printArray(lotto);
    }
 */

fun test2( value:Int)
{
    println("param value = ${value}")

}

fun callByValue(b: Boolean) :Boolean
{
    println("I am callByValue()")
    //    return true
    return b
}

val myTest: () -> Boolean = {
    println("I am myTest()")
    true
}


fun main()
{
    test2(12)

    val result = callByValue( myTest() )
}

