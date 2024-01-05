package leetcode

import scala.annotation.tailrec

object GoodPairs:
/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
*/
  def numIdenticalPairs(nums: Array[Int]): Int =
    var cnt = 0
    for i <- nums.indices do
      for j <- i+1 until nums.length do
        if nums(i) == nums(j) then cnt += 1
    cnt
  end numIdenticalPairs

  def rNumIdenticalPairs(nums: Array[Int]): Int =
    doNumIdenticalPairs(nums)

  /*
  Write as tail recursive as an exercise. Nested for-loop likely the better, more simple solution in this case.
   */
  @tailrec
  private final def doNumIdenticalPairs(ints: Array[Int], res: Int = 0): Int =
    if ints.isEmpty then res
    else
      val head = ints.head
      val tail = ints.tail
      val iCnt = countPairs(tail, head)
      doNumIdenticalPairs(tail, res + iCnt)
  end doNumIdenticalPairs

  @tailrec
  private final def countPairs(others: Array[Int], nbr: Int, res: Int = 0): Int =
    if others.isEmpty then res
    else
      val head = others.head
      val tail = others.tail
      if nbr == head then
        countPairs(tail, nbr, res + 1)
      else
        countPairs(tail, nbr, res)
  end countPairs

end GoodPairs
