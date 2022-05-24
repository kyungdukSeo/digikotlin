package com.kbstar.kotlin

import java.util.*


/*
    int[] lotto = new int[6];
    배열의 치명적인 단점은 동일한 데이터타입의 연속된 메모리를 할당. -> 데이터 티입이 다른것이 들어갈 수 없다.
 */

fun main() {
    var array1 = arrayOf(1,2,3,4,5)
    var array2 = Array(5, {7})
    var anyArray = arrayOf(1, "hello", 12.3, true, 3.14f)
    var intArray = arrayOf<Int> (11, 22, 33, 44, 55)
    var stringArray = arrayOf<String> ("하나", "둘", "셋", "넷", "다섯", "여섯", "일곱")

    // println("array1 = ${array1}, ${array1[2]}")

    // for(i in 0..4)
    // for(i in 0..stringArray.size-1)
    for(i in 0 until stringArray.size)
    {
        // println("array1[$i] : ${array1[i]}")
        // println("array2[$i] : ${array2[i]}")
        // println("anyArray[$i] : ${anyArray[i]}")
        // println("intArray[$i] : ${intArray[i]}")
        println("stringArray[$i] : ${stringArray[i]}")

    }

    println("intArray = ${Arrays.toString(intArray)}")

    var array3 = Array<Int>(4,{0})
    println("array3 = ${Arrays.toString(array3)}")

    var array4 = IntArray(5 , {3})
    println("array4 = ${Arrays.toString(array4)}")

    var array5 = IntArray(5, {i -> (i+1)*5})
    println("array5 = ${Arrays.toString(array5)}")

    // get, set
    var one = array5[1];
    var two = array5.get(2)
    println("one = ${one}, two = ${two}")

    array5[1] = 7
    array5.set(2,22)

    println("array5 = ${Arrays.toString(array5)}")

    // 문자열 = 문자들의 배열
    var hello : String = "HelloKotlinWorld"
    for(i in 0..hello.length-1)
    {
        println("${i} : ${hello[i]}")
    }

    println("substr 1..5 = " + hello.substring(2..5))

    var str1 = "Hello"
    var str2 = "World"
    var str3 = str1 + str2
    println("str3 = ${str3}")

    println("ABC".repeat(10))

    // 연산자를 새롭게 정의
    // "ABC" * 10

    var random = Random()

    for(i in 1 .. 10)
    {
        var num  = random.nextInt(1,46) + 1  // 0~44 + 1
//        var num  = random.nextInt(45) + 1  // 0~44 + 1
        println(num)
    }


}












