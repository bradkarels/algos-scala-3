package io.rev27

import munit.FunSuite

class BinarySearchTest extends FunSuite:
  val verySmall: Seq[Int] = Seq(2,4,6,8,10)
  val small: Seq[Int] = Seq(0,1,3,5,7,8,9,11,14,16,19,20,22,25,27,29,30,31,32,33,38,40,50)
  val veryBig: Seq[Int] = 0 to 1000000000 by 2

  test("search very small set without success"):
    val expected = None
    val obtained = BinarySearch.search(verySmall, 666)
    assertEquals(obtained, expected)

  test("search very small set with success"):
    val expected = Some(8)
    val obtained = BinarySearch.search(verySmall, 8)
    assertEquals(obtained, expected)

  test("search small set without success"):
    val expected = None
    val obtained = BinarySearch.search(small, 666)
    assertEquals(obtained, expected)

  test("search small set with success"):
    val expected = Some(27)
    val obtained = BinarySearch.search(small, 27)
    assertEquals(obtained, expected)

  test("search very big set without success"):
    val expected = None
    val obtained = BinarySearch.search(veryBig, -6)
    assertEquals(obtained, expected)

  test("search very big set with success"):
    val expected = Some(6)
    val obtained = BinarySearch.search(veryBig, 6)
    assertEquals(obtained, expected)
