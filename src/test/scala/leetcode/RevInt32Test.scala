package leetcode

import munit.FunSuite

class RevInt32Test extends FunSuite {

  test("reverse - simple cases"):
    val i0 = 123 // 321
    val i1 = -123 // -321
    val i2 = 120 // 21
    val moreThanMax = 1463847413 // exceeds max of 2147483647
    val lessThanMin = -2147483623 // less than min of -2147483648
    val lotsOfZeros = 1200000000
    val lotsOfZerosNeg = -1200000000
    val obtained0 = RevInt32.reverse(i0)
    val obtained1 = RevInt32.reverse(i1)
    val obtained2 = RevInt32.reverse(i2)
    val obtained3 = RevInt32.reverse(moreThanMax)
    val obtained4 = RevInt32.reverse(lessThanMin)
    val obtained5 = RevInt32.reverse(lotsOfZeros)
    val obtained6 = RevInt32.reverse(lotsOfZerosNeg)
    assertEquals(obtained0, expected = 321)
    assertEquals(obtained1, expected = -321)
    assertEquals(obtained2, expected = 21)
    assertEquals(obtained3, expected = 0)
    assertEquals(obtained4, expected = 0)
    assertEquals(obtained5, expected = 21)
    assertEquals(obtained6, expected = -21)

  test("reverse - zero"):
    val obtained = RevInt32.reverse(0)
    assertEquals(obtained, expected = 0)

  test("-2147483648"): // Abs overflows Int32
    val obtained =  RevInt32.reverse(-2147483648)
    assertEquals(obtained, expected = 0)
}
