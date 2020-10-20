package com.example.init_project

import kotlin.math.max

fun main () {
    val a = 2
    val b = 3
//    print("max nimber is ${largeNumber(a, b)}")
//    print("max nimber is ${maxNumber(a, b)}")
//    print("max nimber is ${ifMaxNumber(a, b)}")
//    print("max nimber is ${getScoreString("Tomsss")}")
//    print("${checkType(2L)}")

    val range = 0 until 10
//    for (index in range step 2) {
//        println(index)
//    }
    for (index in 10 downTo 1) {
        println(index)
    }
}

fun largeNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun maxNumber(num1: Int, num2: Int) = max(num1, num2)

fun ifMaxNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun getScore(name: String) = when (name) {
    "Tom" -> 27
    "Tos" -> 47
    "Toa" -> 37
    "Tox" -> 77
    else -> 0
}

fun getScoreString(name: String) = when {
    name.startsWith("Tom") -> 27
    name == "Tos" -> 47
    name == "Toa" -> 37
    name == "Tox" -> 77
    else -> 0
}

fun checkType(num: Number) {
    when (num) {
        is Int -> println("Int 2333")
        is Double -> println("Double 2333")
        else -> println("else 2333")
    }
}