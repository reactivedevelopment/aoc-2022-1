package com.adventofcode

import com.adventofcode.Day.findMaxElfs

object Day {

  private val allElfs = mutableSetOf<Long>()
  private var currElf = 0L

  fun process(line: String) {
    if (line.isEmpty()) {
      allElfs.add(currElf)
      currElf = 0L
    } else {
      currElf += line.toLong()
    }
  }

  fun findMaxElfs(): Long {
    return allElfs.sorted().takeLast(3).sum()
  }
}

fun main() {
  ::main
    .javaClass
    .getResourceAsStream("/input")!!
    .bufferedReader()
    .forEachLine(Day::process)
  println(findMaxElfs())
}