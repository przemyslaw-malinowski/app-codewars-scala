package org.malinowsky.playground

object Functions extends App {
  def aFun(a: String, b: Int): String = {
    a + " " + b
  }

  def repFunction(s: String, n: Int): String = {
    if(n == 1) s
    else s + " " + repFunction(s, n - 1);
  }

//  print(repFunction("dupa", 3))

  def greeting(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " yo"
  def factorial(n: Int): Int = if(n == 1) n else n * factorial(n - 1)
  def fib(n: Int): Int = if(n == 1) 1 else if(n == 2) 1 else fib(n - 1) + fib(n - 2)

  def prime(n: Int): Boolean = {
    def primeChecker(n: Int, i: Int) : Boolean = {
      if(i > 2) (n % i != 0) && primeChecker(n, i - 1)
      else (n % 2 != 0)
    }
    primeChecker(n, n - 1)
  }

  println(prime(10))
  println(prime(11))
}
