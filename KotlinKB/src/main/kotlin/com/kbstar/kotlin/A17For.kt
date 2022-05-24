package com.kbstar.kotlin

/*
반복문 : for, while(), do~while()
 */

fun main() {
    var sum = 0

    for(x in 1..10)
        print("${x}\t")
        println()

    for(x in 1..10 step 2)
        print("${x}\t")
        println()

    print("Down : ")
    for(x in 5 downTo 1 step 2)
        print("${x}\t")


    println()


    /*
        사용자로부터 구구단의 단(table)을 입력 받아서
        해당하는 단을 출력하시오
     */

    print("Insert talbe : ")
    var table = readLine()!!.toInt()

    for(x in 1..9)
    {
        println("${table} * ${x} = ${table * x}")
    }

    println("--------구구단---------")

    for(x in 2..9)
    {
        println("${x} 단")
        for(y in 1..9)
        {
            println("${x} * ${y} = ${x*y}")
        }
    }

    println("-----별찍기-----")
    print("Insert Lines : ")
    var line = readLine()!!.toInt()

    for (n in 1..line) {
        for (space in 1..(line - n))
            print(" ")
        for (star in 1..(2 * n - 1))
            print("*")
        println()
    }

    // 1~100 합을 구하시오
    sum = 0

    for(x in 1..100)
        sum = sum+x
        print("1+..+100 = ${sum}")


}