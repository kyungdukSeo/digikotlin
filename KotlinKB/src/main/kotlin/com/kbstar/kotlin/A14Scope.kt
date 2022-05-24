package com.kbstar.kotlin

fun a() = println("i am a")
fun b() = a()
fun c() {
    println("i am c")
    fun c1() = println("i am c1")
}

var globalVariable = 10

fun main()
{
    a();
    b()
    // c1()
    c()

    var local1 = 11
    var local2 = 22

    println("gv = ${globalVariable}")

    fun nestedFun()
    {
        globalVariable ++
        var local1 = 33

        println("local1 = ${local1}, local2 = ${local2} gv = ${globalVariable}")

    }

    nestedFun()
    println("local1 = ${local1}, local2 = ${local2} gv = ${globalVariable}")

    outsideFun()
    println("local1 = ${local1}, local2 = ${local2} gv = ${globalVariable}")


}

fun outsideFun()
{
    var local1 = 111
    var local2 = 222
    globalVariable = 333

    println("local1 = ${local1}, local2 = ${local2} gv = ${globalVariable}")

}

















