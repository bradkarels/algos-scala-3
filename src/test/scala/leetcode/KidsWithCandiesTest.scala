package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class KidsWithCandiesTest extends AnyFlatSpec with should.Matchers:
  "Kids" should "get right number of candies with for loop" in:
    val kidsWithCandies0: List[Boolean] = KidsWithCandies.kidsWithCandies(Array(2,3,5,1,3), 3)
    val kidsWithCandies1: List[Boolean] = KidsWithCandies.kidsWithCandies(Array(4,2,1,1,2), 1)
    kidsWithCandies1 shouldBe List(true,false,false,false,false)
    kidsWithCandies0 shouldBe List(true, true, true, false, true)

  "Kids" should "get right number of candies with improved for loop" in :
    val kidsWithCandies0: List[Boolean] = KidsWithCandies.kidsWithCandiez(Array(2, 3, 5, 1, 3), 3)
    val kidsWithCandies1: List[Boolean] = KidsWithCandies.kidsWithCandiez(Array(4, 2, 1, 1, 2), 1)
    kidsWithCandies1 shouldBe List(true, false, false, false, false)
    kidsWithCandies0 shouldBe List(true, true, true, false, true)

  "Kids" should "get right number of candies with tail recursive function" in :
    val kidsWithCandies0: List[Boolean] = KidsWithCandies.kidsWithCandiezz(Array(2, 3, 5, 1, 3), 3)
    val kidsWithCandies1: List[Boolean] = KidsWithCandies.kidsWithCandiezz(Array(4, 2, 1, 1, 2), 1)
    kidsWithCandies1 shouldBe List(true, false, false, false, false)
    kidsWithCandies0 shouldBe List(true, true, true, false, true)
