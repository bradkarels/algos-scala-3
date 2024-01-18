package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ShufflerTest extends AnyFlatSpec with should.Matchers:

  behavior of "ShufflerTest"

  it should "shuffle" in:
    val input0 = Array(2, 5, 1, 3, 4, 7)
    val n0 = 3
    val expected0 = Array(2, 3, 5, 4, 1, 7)

    val input1 = Array(1, 2, 3, 4, 4, 3, 2, 1)
    val n1 = 4
    val expected1 = Array(1, 4, 2, 3, 3, 2, 4, 1)

    val input2 = Array(1, 1, 2, 2)
    val n2 = 2
    val expected2 = Array(1, 2, 1, 2)

    val result0 = Shuffler.shuffle(input0, n0)
    val result1 = Shuffler.shuffle(input1, n1)
    val result2 = Shuffler.shuffle(input2, n2)

    result0 should === (expected0)
    result1 should === (expected1)
    result2 should === (expected2)
