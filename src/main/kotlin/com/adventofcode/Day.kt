package com.adventofcode

fun main() {
  ::main
    .javaClass
    .getResourceAsStream("/day1.example.txt")!!
    .bufferedReader()
    .forEachLine(::println)
}