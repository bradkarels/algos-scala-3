package io.rev27

import munit.FunSuite

class InsertionSortTest extends FunSuite {
  test("Insertion Sort does sort correctly"):
    val giv3n = Array(1, 2, 10, 9, 3, 4, 8, 7, 5, 6)
    val want = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toSeq
    val result = InsertionSort.iSort(giv3n).toSeq
    assertEquals(result, want)

  test("Bigger, worst case sort"): // O(n^2) - careful...
    val biggerArray = (10000 to 0 by -1).toArray
    val want = (0 to 10000).toArray.toSeq
    val result = InsertionSort.iSort(biggerArray).toSeq
    assertEquals(result, want)
}
