package leetcode

import scala.annotation.tailrec

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer
does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
object PlusOne:
  def plusOne(digits: Array[Int]): Array[Int] =
    doPlusOne(digits, toBeAdded = 1)
//    doPlusOneVb(digits, doIncrement = true)

  @tailrec
  private final def doPlusOne(digits: Array[Int], result: Array[Int] = Array.emptyIntArray, toBeAdded: Int = 0): Array[Int] =
    if digits.isEmpty then
      if toBeAdded == 0 then result
      else toBeAdded +: result
    else
      val newLast = digits.last + toBeAdded
      val newDigits = digits.dropRight(1)
      if newLast < 10 then
        doPlusOne(newDigits, newLast +: result)
      else
        doPlusOne(newDigits, newLast % 10 +: result, 1)

  /**
   * Fuddling with boolean vs. numeric (8 bit vs 32 bit) - unsure if of value...
   */
  @tailrec
  private final def doPlusOneVb(digits: Array[Int], result: Array[Int] = Array.emptyIntArray, doIncrement: Boolean = false): Array[Int] =
    if digits.isEmpty then
      if !doIncrement then result
      else 1 +: result
    else
      val newLast = if doIncrement then digits.last + 1
                    else digits.last
      val newDigits = digits.dropRight(1)
      if newLast < 10 then
        doPlusOneVb(newDigits, newLast +: result)
      else
        doPlusOneVb(newDigits, newLast % 10 +: result, true)

end PlusOne
