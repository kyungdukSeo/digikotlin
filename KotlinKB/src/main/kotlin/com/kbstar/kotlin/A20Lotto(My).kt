package com.kbstar.kotlin

import java.util.*


/*
    무한루프를 돈다.
    사용자한테 게임수를 입력받는다(1~5) : readLine()

    0 : 프로그램 종료
    3 : 3게임의 로또번호를 생성합니다.
        중복제거 보장..
        오름차순 정렬

 */

fun main() {
    var a = 2
    var b = 5

    println("a = %02d, b = %05d".format(a,b))


    while(true)
    {
        println("[0]Exit    [1~5]Game")
        print("Insert game : ")
        var game = readLine()!!.toInt()

        var random = Random()
        // var lotto = IntArray(6, {random.nextInt(1, 46)})

        if(game in 1..5)
        {
            for(x in 1..game)
            {
                print("${x} game : ")
                var lotto = IntArray(6, {random.nextInt(1, 46)})


                for(y in 0..5)
                    print("${lotto[y]}\t")

                println()
            }
        }

        if(game==0)
            break;
    }

    println("Game Over")
}












