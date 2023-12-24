package io.rev27

import munit.FunSuite

class QuickSortTest extends FunSuite:
  test("Quicksort should sort"):
    val tstArr: Seq[Int] = Array(9,10,3,0,1,6)
    val expected: Seq[Int] = Array(0,1,3,6,9,10)
    assertEquals(QuickSort.quickSort(tstArr), expected)

  test("Bigger silly sort..."):
    val bigSeq: Seq[Int] = 0 until 1000
    val revBigSeq: Seq[Int] = bigSeq.reverse // Silly worst case scenario...
    val result = QuickSort.quickSort(revBigSeq)
    assertEquals(result, bigSeq)

