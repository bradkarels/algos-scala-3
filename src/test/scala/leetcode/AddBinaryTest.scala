package leetcode

import munit.FunSuite

class AddBinaryTest extends FunSuite:
  val a0 = "11"
  val b0 =  "1"
  val expected0 = "100"

  val a1 = "1010"
  val b1 = "1011"
  val expected1 = "10101"

  val a2 = "111"
  val b2 = "111"
  val expected2 = "1110"

  val a3 = "111"
  val b3 =  "11"
  val expected3 = "1010"

  val a5 = "1"
  val b5 = "1"
  val expected5 = "10"

  val a6        = "101010101"
  val b6        =         "1"
  val expected6 = "101010110"

  test("case all cases"):
    val obtained0 = AddBinary.addBinary(a0,b0)
    assertEquals(obtained0, expected0)
    val obtained1 = AddBinary.addBinary(a1,b1)
    assertEquals(obtained1, expected1)
    val obtained2 = AddBinary.addBinary(a2,b2)
    assertEquals(obtained2, expected2)
    val obtained3 = AddBinary.addBinary(a3,b3)
    assertEquals(obtained3, expected3)
    val obtained5 = AddBinary.addBinary(a5,b5)
    assertEquals(obtained5, expected5)
    val obtained6 = AddBinary.addBinary(a6,b6)
    assertEquals(obtained6, expected6)
