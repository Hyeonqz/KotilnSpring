package org.example.Ex1

import java.util.*

fun main() {
        var a: Int = 0
        var b = 10
        var c: Int = 20
        var d: Int? = null

        callFunction(a)
        callFunction(b)
        callFunction(c)
        callFunction(d)

        Optional.ofNullable(d).ifPresent{
            it -> println(it)
        }



    }

    // 🌟🌟🌟 ?(엘비스 연산자) -> Null 값이 들어올수 있음을 명시하는 암묵적인 것.🌟🌟🌟
    // 변수? << 변수가 null ??
    // 변수?. << 변수가 null 이 아닐 떄
    // 변수 ?: << 변수가 Null 일 때
    fun callFunction(i: Int?) {

        val temp = if(i==null) "null" else i
        val temp1 = i ?: "null"

        var temp3 = i?.let { it * 20 } ?: "null 값이다"
        println(temp)
        println(temp1)
        println(temp3)

        i?.let{
            println(it)
        }?: run {
            println("null")
        }

        println(i)
    }