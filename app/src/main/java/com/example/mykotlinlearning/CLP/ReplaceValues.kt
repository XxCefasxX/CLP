package com.example.mykotlinlearning.CLP

fun main() {
    val keyWords = mapOf("@test" to "laptop", "@okay" to "gone")
    val inputWord ="some random string @test challenge @okay"
    var outputWord=inputWord
    for(word in keyWords){
       outputWord = outputWord.replace(word.key,word.value)
    }
    println(outputWord)

}