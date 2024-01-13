package leetcode

import scala.annotation.tailrec

/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

object IsPalindrome:
  def isPalindrome(x: Int): Boolean =
    if x < 0 then false
    else
      val arrayOfX = intToArray(x)
      findPalindrome(arrayOfX)

  @tailrec
  private final def findPalindrome(ia: Array[Int]): Boolean =
    if ia.length <= 1 then true
    else
      if ia.head == ia.last then
        findPalindrome(ia.drop(1).dropRight(1))
      else
        false
  end findPalindrome

  @tailrec
  def intToArray(i: Int, result: Array[Int] = Array.emptyIntArray): Array[Int] =
    if i < 10 then i +: result
    else
      intToArray(i / 10, i % 10 +: result)

end IsPalindrome
