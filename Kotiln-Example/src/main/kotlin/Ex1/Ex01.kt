package org.example.Ex1

import kotlin.math.PI

// kotlin 은 꼭 클래스 이름이 같지 않아도 된다.
fun main() {
    // var(변하는 객체==mutable), val(불변 객체 -> final 객체 immutable) 키워드를 통해 선언한다.
    // 변수 선언시, 불변성인지 가변성인지를 잘 확인해야 한다.
    // 코틀린은 모든게 객체로 관리가 된다.

    // : [타입] = 초기화
    val name: String = "홍길동"
    var _name: String = "홍길동";
    val n = "홍길동"; // 타입 추론이 가능하다.

    println("사용자의 이름은 : ${name}")

    // 코틀린은 모두다 Wrapper 타입이다.
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0

    var f: Float = 10f
    var b: Boolean = true

    var result = "사용자의 이름은 : %s".format(name);
    println(result)
}