package org.malinowsky.playground

import scala.util.Random

object DefaultArgs  extends App {
  def function(e: => Int) = {
    println(e)
    println(e)
  }

  def fun(): Int = {
    Random.nextInt(1000)
  }

  def factorial(n: Int): Int = if(n == 1) n else n * factorial(n - 1)

  def cat(s: String, i: Int): String =
    if(i <= 0) s
    else cat(s + " " + s, i -1)

  println(cat("", 10))
}
