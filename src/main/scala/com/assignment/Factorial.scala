package com.assignment

class Factorial {

  def withRecursion(number: Int): Int = {
    if (number <= 1)
      return number
    number * withRecursion(number - 1)
  }

  def withTailRec(number: Int): Int = {
    def tailRecursion(number: Int, accumulator: Int = 1): Int = {
      if (number <= 1) return accumulator
      tailRecursion(number - 1, number * accumulator)
    }
    tailRecursion(number)
  }

}
object run extends App{
  val n = new Factorial
  println(n.withRecursion(5))
  println(n.withTailRec(5))
}