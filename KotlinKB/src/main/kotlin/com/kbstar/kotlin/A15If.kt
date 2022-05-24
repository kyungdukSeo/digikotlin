package com.kbstar.kotlin

fun main() {

    // console 사용자 입력

    print("Insert Number : ")
    val num = readLine()!!.toInt()          //  !! 는 딜리베이터(?) 없다는 뜻

    println("num = ${num}")

    var grade = 'F'

    if(num>= 90)
        grade = 'A'
    else if(num >= 80)
        grade ='B'
    else
        grade ='F'

    println("Your grade = ${grade}")


    grade = 'F'

    print("Insert Number2 : ")
    var num2 = readLine()!!.toDouble()

    if(num2>=90.0)
        grade = 'A'
    else if(num2 in 80.0..89.9)
        grade = 'B'
    else if(num2 in 70.0..79.9)
        grade = 'C'
    else
        grade = 'F'

    println("num2 = ${num2}, Your grade = ${grade}")


    print("Insert Score (Double) : ")
    var score = readLine()!!.toDouble()

    // grade = 'F'
    when(score)
    {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'

        !in 70.0..100.0 -> grade = 'F'  // default 역할을 한다.
    }
    println("Score = ${score}, grade = ${grade}")


    print("Insert Score(Double) : ")
    score = readLine()!!.toDouble()

    when
    {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'

    }
    println("Score = ${score}, grade = ${grade}")


}