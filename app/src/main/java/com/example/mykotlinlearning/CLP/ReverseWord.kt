package com.example.mykotlinlearning.CLP

fun main() {

    val word: String = "aaba"
    var revertedWord: String = ""
    for (w in word) {
        revertedWord = w + "" + revertedWord

    }

    println(revertedWord)
}


