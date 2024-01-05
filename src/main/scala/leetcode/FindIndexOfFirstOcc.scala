package leetcode

import scala.annotation.tailrec

object FindIndexOfFirstOcc:
  //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
  // or -1 if needle is not part of haystack.
  //
  //Example 1:
  //
  //Input: haystack = "sadbutsad", needle = "sad"
  //Output: 0
  //Explanation: "sad" occurs at index 0 and 6.
  //The first occurrence is at index 0, so we return 0.
  //
  //Example 2:
  //Input: haystack = "leetcode", needle = "leeto"
  //Output: -1
  //Explanation: "leeto" did not occur in "leetcode", so we return -1.
  def strStr(haystack: String, needle: String): Int =
    doStrStr(haystack, needle.toCharArray)

  @tailrec
  private final def doStrStr(haystack: String, needle: Array[Char], idx: Int = 0): Int =
    lazy val head = haystack.head
    val needleLen = needle.length
    if haystack.length < needleLen then -1
    else if head == needle(0) then // Fail fast on head mismatch
      val taken = haystack.take(needleLen).toCharArray
      val zipped = needle.zip(taken)
      if zipped.count(e => e._1 == e._2) == needleLen then idx
      else doStrStr(haystack.tail, needle, idx + 1)
    else
      doStrStr(haystack.tail, needle, idx + 1)
