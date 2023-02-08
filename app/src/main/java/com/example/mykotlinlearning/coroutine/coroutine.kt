package com.example.mykotlinlearning.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        delay(1000)
        println("hello")
    }
    runBlocking {
        println("world")
    }
}
