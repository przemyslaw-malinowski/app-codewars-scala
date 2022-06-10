package org.malinowsky.codewars.count.characters.in.string

import scala.collection.mutable

object Kata extends App {
  def count(string: String): Map[Char,Int] = {
    def counter(string: String, aggregator: mutable.Map[Char, Int]): Map[Char,Int] = {
      if(string.length <= 0) {
        aggregator.toMap
      } else {
        val char = string charAt 0

        if(!aggregator.contains(char)){
          aggregator += (char -> 1)
        } else {
          aggregator(char) = aggregator(char) + 1
        }

        counter(string.substring(1), aggregator)
      }
    }

    counter(string, mutable.Map.empty[Char, Int])
  }
}
