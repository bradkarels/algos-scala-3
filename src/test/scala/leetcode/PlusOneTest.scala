package leetcode

import leetcode.PlusOne.plusOne
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PlusOneTest extends AnyFlatSpec with should.Matchers:

  behavior of "PlusOneTest"

  it should "add one to existing int array format - simple" in:
    val intArray0 = Array(1,2,3)
    val expected0 = Array(1,2,4)
    val intArray1 = Array(4,3,2,1)
    val expected1 = Array(4,3,2,2)
    plusOne(intArray0) should === (expected0)
    plusOne(intArray1) should === (expected1)

  it should "add one to existing int array format - w/carried" in:
    val intArray2 = Array(9)
    val expected2 = Array(1, 0)
    plusOne(intArray2) should === (expected2)

  it should "add one to existing int array format - nines" in :
    val intArray9 = Array(9, 9, 9, 9, 9, 9, 9)
    val expected9 = Array(1, 0, 0, 0, 0, 0, 0, 0)
    plusOne(intArray9) should ===(expected9)
