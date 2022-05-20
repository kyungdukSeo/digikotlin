package com.kbstar.kotlin

// A07Function.kt

/*
    result = add(a,b)
    int add(int a, int b)
    {
        //
        return a+b;
    }
 */

fun add(a:Int, b:Int) : Int
{
    var total = a + b;
    return total;
}

fun max(a: Int, b: Int) = if(a>b) a else b
fun sum(a: Int, b: Int) = a+b
fun product(a: Int, b: Int, c: Int) = a * b * c
fun addString(a:String, b:String) = a + b

fun printSum(a:Int, b: Int) : Unit
{
    println("param a = ${a}, b = ${b} , sum = ${a+b}")
}

// printSayHello()
fun printSayHello() : Unit
{
    println("안녕하세요")
}




fun main() {
    val result1 = add(1,2)
    var result2 = add(3,4)

    println("result1 = ${result1}")
    println("result2 = ${result2}")
    println("result3 = " + add(5,6))

    var result3 = sum(1,2)
    println("sum = ${result3}" )

    var myString:String = addString("Hello", "World")
    println(myString)

    printSum(1,2)

    /*
    다른 언어 : void (리턴값이 없다)
    코틀린 : Unit
     */

    // 매개변수(파라미터)가 없는 함수는 바로 사용
    val greet: () -> Unit = {println("Hello ~~")}
    println("greet = ${greet}")
    println("greet = ${greet()}")

    // Default Argument
    addUser("kdhong", "kdhong@kbstar.com")
    addUser("sslee")

    defaultArgs(10,20)
    defaultArgs(10)
    defaultArgs()

    // Named Parameter
    defaultArgs(b=100)
    defaultArgs(b=4,a=3)

    // 가변길이 매개변수(파라미터)
    /*
        System.out.println("a=%d, b=%d, c=%d", a,b,c)
        test(a,b,....)
     */

    var x = 0;
    x = variableArgs(1,2,3)
    println("x = ${x}")
    x = variableArgs(1,2,3,4,5,6,7)
    println("x = ${x}")


}

fun variableArgs(vararg counts: Int) : Int
{
    // for( ; ; )
    // for(value : lotto)
    var total = 0;

    for (num in counts)
    {
        // println(num)
        total = total + num;
    }

    return total;
}


fun defaultArgs(a:Int = 1, b:Int = 2) : Unit    // Unit은 생략이 가능
{
    println("a = ${a}, b = ${b}")
}


// addWord(a, b="hello", c="kbstar")
fun addUser(name: String, email: String = "user@test.com") : Unit
{
    println("i am addUser()")
    println("name : ${name}, email : ${email}")
}


