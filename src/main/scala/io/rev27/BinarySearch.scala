package io.rev27

import scala.annotation.tailrec

// Simple implementation of a binary search for ordered list w/recursive fn.
object BinarySearch:
  def search(s: Seq[Int], tgt: Int): Option[Int] =
    doSearch(s, tgt)

  @tailrec
  private final def doSearch(s: Seq[Int], tgt: Int): Option[Int] =
    val len = s.length
    if len == 1 && s.head == tgt then Some(tgt)
    else if len <= 1 then None
    else
      val mid = len/2
      val guess = s(mid)
      if guess == tgt then Some(tgt)
      else if guess < tgt then
        val slicedUp = s.slice(mid + 1, len)
        doSearch(slicedUp, tgt)
      else
        val slicedDown = s.slice(0, mid)
        doSearch(slicedDown, tgt)
