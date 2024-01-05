package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class GoodPairsTest extends AnyFlatSpec with should.Matchers:
  val inputNbrs0 = Array(1,2,3,1,1,3)
  val expected0 = 4
  val inputNbrs1 = Array(1,1,1,1)
  val expected1 = 6
  val inputNbrs2 = Array(1,2,3)
  val expected2 = 0

  "good pairs 0" should "count four" in:
    val obtained = GoodPairs.numIdenticalPairs(inputNbrs0)
    obtained shouldBe expected0

  "good pairs 1" should "count six" in:
    val obtained = GoodPairs.numIdenticalPairs(inputNbrs1)
    obtained shouldBe expected1

  "good pairs 2" should "count zero" in:
    val obtained = GoodPairs.numIdenticalPairs(inputNbrs2)
    obtained shouldBe expected2

  "recursive good pairs 0" should "count four" in :
    val obtained = GoodPairs.rNumIdenticalPairs(inputNbrs0)
    obtained shouldBe expected0

  "recursive good pairs 1" should "count six" in :
    val obtained = GoodPairs.rNumIdenticalPairs(inputNbrs1)
    obtained shouldBe expected1

  "recursive good pairs 2" should "count zero" in :
    val obtained = GoodPairs.rNumIdenticalPairs(inputNbrs2)
    obtained shouldBe expected2
