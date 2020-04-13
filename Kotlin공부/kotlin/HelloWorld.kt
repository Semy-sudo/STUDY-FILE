package com.example.kotlin

fun main() {
    //변수 만들기
    val hello1: String = "hello world" //val == final
    //자바와 차이
    var hello2: String? = null //var ==String,int,float,double
    var hello3: String ="hello hello"//null 넣을수 없다
    println(hello1)
    println(hello2)

    println(hello())
}
fun hello():String {//void

    return "hello fun!"
}