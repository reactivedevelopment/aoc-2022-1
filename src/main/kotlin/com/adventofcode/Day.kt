package com.adventofcode

object Day {

  fun process(line: String) {

  }
}

fun main() {
  ::main
    .javaClass
    .getResourceAsStream("/day.1.txt")!!
    .bufferedReader()
    .forEachLine(Day::process)
}