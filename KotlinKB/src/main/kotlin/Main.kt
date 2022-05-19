fun main() {
    println("Hello World!")
    println("Hello World! 한글 테스트");
    println("Hello World!")

    var age = 10;
    println("age = ${age}")     // JSP custom action, PHP       ${age} 이 방식을 사용하길 추천함
    println("age = ${age + 3}") // JSP custom action
    println(age);               // java
    println("age = " + age);    // java
    println("age = $age");      // PHP

    age = age + 10;
    println("new age = ${age}")


    val sallary = 1000;             // constant final..
    println("sallary = ${sallary}")
    println("sallary = " + sallary)
    // println("sallary = " + ${sallary}) 이땐 $ 쓰면 error
    // sallary = 2000;

    var name ="kim"
    println("name = ${name}")
    name = name + "Kildong"
    println("name = ${name}")

    // name = 12;   // 처음 선언할 때 변수 타입이 정해지는 구조로 error



}