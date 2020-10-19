package com.example.init_project

import kotlin.math.max

fun main () {
    val a = 2
    val b = 3
//    print("max nimber is ${largeNumber(a, b)}")
    print("max nimber is ${maxNumber(a, b)}")
}

fun largeNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun maxNumber(num1: Int, num2: Int) = max(num1, num2)