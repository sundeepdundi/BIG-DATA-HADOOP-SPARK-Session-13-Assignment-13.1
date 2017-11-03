package com.assignment.gcd
//Create a Scala application to find the GCD of two numbers.
//Greatest Common Divisor 
object GCDObject {
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def main(args: Array[String]): Unit = {
    var a=12
    var b=16
    print("Greatest Common Divisor of "+ a+" and "+b +" is : \t")
    print(gcd(a, b))
  }
}