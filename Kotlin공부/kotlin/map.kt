package com.example.kotlin
//map - key, value 로 이루어짐
//{"name":"semy"}
//mapOf, mutableMapOf
fun main(){
    var map1 = mapOf(Pair("name","senti"))
    var map2 = mutableMapOf<String,String>()
    map2.put("name","senti")
    map2.put("age","1")
    for(map in map2){
        println(map2)
    }
    println(map2.keys)
    println(map2.values)
}