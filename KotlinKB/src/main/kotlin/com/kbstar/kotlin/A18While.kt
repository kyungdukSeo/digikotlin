package com.kbstar.kotlin

/*
반복문 : for, while(), do~while()
 */

fun main() {
    // 1. 1~10 합
    // while : 컴파일 전에 눈으로 확인해야한다.  빠져나가는 조건 필수!

    var sum = 0
    var x = 0

    while(x <= 10)
    {
        print("${x}\t")
        x++
    }
    println()

    println("Factorial !!!")
    print("Insert Number : ")
    var num = readLine()!!.toInt()
    // 5!
    var factorial : Long = 1
    var orgNum = num

    while(num > 0)
    {
        factorial = factorial * num
        num--
    }

    println("${orgNum}! = ${factorial}")

    // fact(n)
    // n * fact(n-1)
    /*
    fact(5)
    = 5 * fact(4)
    =   4 * fact(3)
    =       3 * fact(2)
    =           2 * fact(1)
     */

    var result = fact(5)
    println("recursive 5! = ${result}")


    doWhileTest()




}

fun doWhileTest() : Unit
{
    println("i am doWhileTest")

    var num = 0
    do{
        println("num = ${num}")
        num++

    }while(num<=10)
}

/*
    return,
    break : 나를 둘러싼 반복문을 빠져나간다.
    continue : 반복문을 아랫줄을 수행하지 말고, 다음 조건으로 넘어간다.
 */


fun fact(no:Int) : Long
{
    if(no == 1)
        return 1

    return no * fact(no-1)
}


