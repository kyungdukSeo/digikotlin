package com.kbstar.kotlin


fun main()
{
    // 사용자 입력했다고 가정
    var a = 6
    var b = 0
    var result : Int

    try {
        result = a/b
        println("result = ${result }")

    }catch (e:java.lang.Exception)
    {
            println("Exception : ${e.message}")
    }finally {
        println("Finally..")
    }

    // Throw
    try {
        divide()
    }catch (e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }


}

fun divide()
{
    var x = 3
    var y = 0

    if(y==0)
    {
        throw java.lang.Exception("zero operation!!")
    }
}








