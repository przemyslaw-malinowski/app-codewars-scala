package org.malinowsky.codewars.count.positives.sum.negatives

import scala.annotation.tailrec

object Kata extends App {
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    @tailrec
    def sumPositivesNegatives(positives: Int = 0, negatives: Int = 0, ints: Array[Int] = integers, p: Int = 0): (Int, Int) = {
      if(p >= ints.length) {
        return (positives, negatives)
      }
      if(ints(p) > 0) {
        sumPositivesNegatives(positives + 1, negatives, ints, p + 1)
      } else if(ints(p) < 0) {
        sumPositivesNegatives(positives, negatives + ints(p), ints, p + 1)
      } else {
        sumPositivesNegatives(positives, negatives, ints, p + 1)
      }
    }

    sumPositivesNegatives(ints = integers)
  }

  def positiveSum(arr: Array[Int]): Int = {
    arr.filter(_ > 0).sum
  }

  println(countPositivesSumNegatives(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
}
