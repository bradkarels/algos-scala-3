package leetcode

import scala.:+
import scala.annotation.tailrec

object RevInt32:
  //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
  //
  //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
  //
  //Example 1:
  //Input: x = 123
  //Output: 321
  //
  //Example 2:
  //Input: x = -123
  //Output: -321
  //
  //Example 3:
  //Input: x = 120
  //Output: 21
  def reverse(x: Int): Int =
    if x == Int.MinValue then 0
    else
      lazy val posNeg = if (x >= 0) 1 else -1
      val posX = x.abs
      val ints = doReverse(posX)
      val asBigInt = strToBigInt(ints)
      if asBigInt.isValidInt then asBigInt.toInt * posNeg
      else 0

  @tailrec
  private final def doReverse(x: Int, xs: Seq[Int] = Seq.empty[Int]): Seq[Int] =
    if x == 0 then
      val trimmed = xs.dropWhile(_ == 0) // Remove leading zeros
      if trimmed.isEmpty then Seq(0)
      else trimmed
    else
      val nextDigit = x % 10
      val newX = x / 10
      doReverse(newX, xs :+ nextDigit)


val strToBigInt = (ints: Seq[Int]) =>
//  val sb = StringBuilder("")
  val sb = new StringBuilder
  for i <- ints do
    sb.append(i)
  BigInt(sb.toString())
