package org.malinowsky.playground

import scala.annotation.tailrec

object Recursion extends App {
//  def fac(n: Int): BigInt = {
//    if(n <= 1) 1
//    else n * fac(n - 1)
//  }
//  print(fac(5000))

  def pow(k: Int, j: Int): BigInt = {
    if(j <= 1) k
    else k * pow(k, j - 1)
  }

  def pow2(k: Int, j: Int): BigInt = {
    def poww(base: Int, product: BigInt, exponent: Int): BigInt = {
      if(exponent <= 1) product
      else poww(base, product * base, exponent - 1)
    }

    poww(k, k, j)
  }

  println(pow(2, 4))
  println(pow2(2, 4))

  def catenation(s: String, t: Int) : String ={
    @tailrec
    def cat(s: String, result: String, t: Int): String = {
      val k = if(t % 2  == 0) s.toUpperCase() else s.toLowerCase();
      if(t == 0) result
      else cat(s, if (result.equals("")) k else result + " " + k, t - 1)
    }
    cat(s, "", t)
  }

  println(catenation("lol", 5))
}
