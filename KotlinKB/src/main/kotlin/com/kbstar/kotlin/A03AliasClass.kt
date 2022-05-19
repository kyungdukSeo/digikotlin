package com.kbstar.kotlin

// A03AliasClass 닉네임 짓기 as

import com.kbstar.kotlin.A02Car as Car

fun main() {
    val taxi = Car("alias taxi", 1)
    val bus = Car("alias bus", 2)
    val truck = com.kbstar.kotlin.A02Car("alias truck", 3)

    print("taxi.name = ${taxi.name}")

    /*
        C : ip 주소 1.2.3.4
        unsigned int serverIP = 12345

        IP serverIP = 1234
        IP clientIP = 223344

        typedef unsigned int IP_t
     */

}