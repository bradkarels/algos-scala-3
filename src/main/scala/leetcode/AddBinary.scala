package leetcode

import scala.annotation.tailrec

object AddBinary:
  def addBinary(a: String, b: String): String =
    doAddBinary(a,b)
    
  private def mkNext(s: String): Option[String] =
    if s.isEmpty || s.takeRight(1) == "0" then None
    else Some(s.takeRight(1)) // could just Some("1")...if we assume good binary
    
  @tailrec
  private final def doAddBinary(a: String, b: String, sum: String = "", c: String = ""): String =
    if (a.isEmpty && b.isEmpty) && c.isEmpty then sum
    else
      val aNext = mkNext(a)
      val bNext = mkNext(b)
      val cNext = mkNext(c)
      val digit = (aNext, bNext, cNext)
      lazy val droppedA = a.dropRight(1)
      lazy val droppedB = b.dropRight(1)
      digit match
        case (None, None, None)          => doAddBinary(droppedA, droppedB, "0" + sum)
        case (None, None, Some(_))       => doAddBinary(droppedA, droppedB, "1" + sum)
        case (Some(_), None, None)       => doAddBinary(droppedA, droppedB, "1" + sum)
        case (None, Some(_), None)       => doAddBinary(droppedA, droppedB, "1" + sum)
        case (None, Some(_), Some(_))    => doAddBinary(droppedA, droppedB, "0" + sum, "1")
        case (Some(_), None, Some(_))    => doAddBinary(droppedA, droppedB, "0" + sum, "1")
        case (Some(_), Some(_), None)    => doAddBinary(droppedA, droppedB, "0" + sum, "1")
        case (Some(_), Some(_), Some(_)) => doAddBinary(droppedA, droppedB, "1" + sum, "1")