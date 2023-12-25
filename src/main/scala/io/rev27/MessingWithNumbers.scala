package io.rev27

import scala.annotation.tailrec

// TODO: Create as extension methods.
object MessingWithNumbers:
  def sum(a: Array[Int]): Int =
    doSum(a)

  @tailrec
  private final def doSum(a: Array[Int], sum: Int = 0): Int =
    if a.isEmpty then sum
    else doSum(a.tail, sum + a.head)

  def count(a: Array[Int]): Int =
    doCount(a)

  @tailrec
  private final def doCount(a: Array[Int], cnt: Int = 0): Int =
    if a.isEmpty then cnt
    else doCount(a.tail, cnt + 1)

  def max(a: Array[Int]): Int =
    doMax(a, a(0))

  @tailrec
  private final def doMax(a: Array[Int], max: Int): Int =
    if a.isEmpty then max
    else
      val head = a.head
      val tail = a.tail
      if head > max then doMax(a.tail, head)
      else doMax(tail, max)
