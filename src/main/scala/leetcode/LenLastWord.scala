package leetcode

import scala.annotation.tailrec

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/
object LenLastWord:
  def lengthOfLastWord(s: String): Int =
    val lastWord = s.split(" ").last
    lastWord.length

  // Funky recursive as exercise...
  def rLengthOfLastWord(s: String): Int =
    rDoLengthOfLastWord(s.reverse)

  @tailrec
  private final def rDoLengthOfLastWord(s: String, lastWord: String = ""): Int =
    if s.isEmpty then lastWord.length
    else
      val head = s.head
      if head.isWhitespace && lastWord.isEmpty then rDoLengthOfLastWord(s.tail)
      else if !head.isWhitespace then
        val newLastWord = lastWord + s.head
        rDoLengthOfLastWord(s.tail, newLastWord)
      else
        rDoLengthOfLastWord("", lastWord)
