package com.example.init_project

class Student(val sno: String, val grade: Int, age: Int, name: String): Person(age, name) {
    // NOTE: 次构造函数之间可以互相调用，但每一个次构造函数必须直接或间接的调用的主构造函数
    constructor(name: String, age: Int): this("", 0, 0, "")
    constructor(): this("", 0)
}

// NOTE: Man 类没有显式的定义主构造函数，同时又因为定义了次构造函数，所以 Student 是没有主构造函数的，那么继承的 Person 类也不需要加上括号。
class Man: Person {
    constructor(age: Int, name: String): super(0, "") {

    }
}