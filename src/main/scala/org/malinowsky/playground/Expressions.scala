package org.malinowsky.playground

object Expressions extends App {
  val x = 1 + 2 //WYRAŻENIE

  println(x)

  var cond = true;
  val unconditionalBranch = if(cond) "wypierdalaj" else "dej sos";
  println(unconditionalBranch)

  val zzz = {
    val z = 4;
    val y = 6;
    if (3 > 4) "kurwa" else "mać"
  }

  println(zzz)

  val someVal = {
    2 < 3
  }

  val someOtherShit = {
    if(someVal) 444 else 54
    88
  }

  println(someVal)
  println(someOtherShit)

}
