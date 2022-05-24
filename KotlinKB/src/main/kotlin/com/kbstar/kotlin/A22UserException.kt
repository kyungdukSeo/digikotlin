package com.kbstar.kotlin

// A22UserException

// 사용자 예외 클래스 만들기
class TestException(messages: String) : java.lang.Exception(messages)

// mobile 입력 받아서
// 010-1111-2222 형식에 맞는지 확인


fun main() {
    var name = "kdhong111"
    var mobile = "010-1111-1111"
    var kname = "홍길동"

    // name
    try {
        validateName(name)

    }catch (e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }

    // mobile
    try {
        validateMobile(mobile)

    }catch (e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }

    // kname
    try {
        validateKname(kname)

    }catch (e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }


}

fun validateName(name: String)
{
    if(name.matches(Regex("[a-zA-Z]{1,10}")))
    {
        println("정상")
    }else
    {
        throw TestException("Name has Number!!")

    }
}

fun validateMobile(Mobile: String)
{
    if(Mobile.matches(Regex("^01[01]-[0-9]{4}-\\d{4}")))
    {
        println("정상 폰번호")
    }else
    {
        throw TestException("Invalid Mobile Number!!")

    }
}


fun validateKname(Kname: String)
{
    if(Kname.matches(Regex("^[가-힣]{2,4}$")))
    {
        println("정상 한글이름")
    }else
    {
        throw TestException("Invalid 한글이름!!")

    }
}

