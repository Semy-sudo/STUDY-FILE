package com.example.kotlin
//클래스: 유사 기능들의 집합체(객체)
//1.class- 2.data
fun main(){

    var cls = aboutclass()
    var cls2 = aboutclass(5)
    println(cls)
    println(cls2)
  //  var person = Person(age = 5, name = "semy")
}
class aboutclass {
    var age :Int =0

    constructor() //생성자
    constructor(age:Int) {this.age =age}//보조 생성자

}

data class Person(var age:Int, var name:String)
