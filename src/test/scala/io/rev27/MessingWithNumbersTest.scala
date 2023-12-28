package io.rev27

import munit.FunSuite

class MessingWithNumbersTest extends FunSuite:
  val a: Array[Int] = Array(1,2,4,8,16,32,64,128)
  val b: Array[Int] = Array(1,2,666,0,0,-666)

  test("max"):
    val obtained0 = MessingWithNumbers.max(a)
    val obtained1 = MessingWithNumbers.max(b)
    assertEquals(obtained0, expected = 128)
    assertEquals(obtained1, expected = 666)

  test("count"):
    val obtained0 = MessingWithNumbers.count(a)
    val obtained1 = MessingWithNumbers.count(b)
    assertEquals(obtained0, expected = 8)
    assertEquals(obtained1, expected = 6)

  test("sum"):
    val obtained0 = MessingWithNumbers.sum(a)
    val obtained1 = MessingWithNumbers.sum(b)
    assertEquals(obtained0, expected = 255)
    assertEquals(obtained1, expected = 3)

  test("sum as recursive extension"):
    import io.rev27.MessingWithNumbers.exSum // Hmmm, clunky...
    val obtained = Array(1,2,3).exSum
    val expected  = 6
    assertEquals(obtained, expected)
