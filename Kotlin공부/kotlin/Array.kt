package com.example.kotlin

fun main() {
    //1.배열
    //2.loop 반복
    //3.캐스팅(가볍게)

    //1.배열={"","",""}
    var arr1 = listOf("1","2") //
    var arr2 = mutableListOf("1","2")
    arr2.add("3")//수정 가능

    //2.반복문(자바에서 향상된 반복문)
    for(item in arr1){
        println(item)
    }
   for((index,item) in arr2.withIndex()){
       println("$index,$item")
   }
    //3.casting object<String, int, long.....>모두 담을수 있는 최상위객체
    //auto casting
    var hello: Any = "hello"
    if(hello is String) {
        var str: String ="hello"
    }


}