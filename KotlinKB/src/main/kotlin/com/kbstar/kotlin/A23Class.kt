package com.kbstar.kotlin



class Bird{
    // Field(Java), Property(Kotlin)
    var name: String = "myBird"
    var wing: Int = 2
    var beak: String = "Short"
    var color: String = "Blue"

    // Method
    fun fly() = println("Fly Wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")


}

fun main() {
    val eagle = Bird()  // eagle ---------(HEAP)---------> Object
    eagle.color = "black"
    eagle.name = "eagle"

    println("eagle.name = ${eagle.name}, eagle.color = ${eagle.color}, eagle.wing = " + eagle.wing)

    eagle.fly()
    eagle.sing(4)
    
    // 생성자 : 초기화 메소드

}