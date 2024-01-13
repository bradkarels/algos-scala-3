package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class IsPalindromeTest extends AnyFlatSpec with should.Matchers:

  behavior of "intToArray"

  it should "convert to an array correctly" in:
    val nbr0 = 123
    val nbr1 = 987654321
    val expected0 = Array(1,2,3)
    val expected1 = Array(9,8,7,6,5,4,3,2,1)
    IsPalindrome.intToArray(nbr0) should === (expected0)
    IsPalindrome.intToArray(nbr1) should === (expected1)

  behavior of "isPalindrome"

  it should "should determine if a positive int is a palindrome" in:
    // Practicing writing Dutch nummers - impractical, but fun.
    val goedéén = 122333221
    val goedtwee = 2222222
    val goeddrei = 33
    val slechteen = 123
    val slechttwee = -222
    val slechtdrei = 33327
    val slechtvier = 27
    val goedNull = 0
    IsPalindrome.isPalindrome(goedéén) shouldBe true
    IsPalindrome.isPalindrome(goedtwee) shouldBe true
    IsPalindrome.isPalindrome(goeddrei) shouldBe true
    IsPalindrome.isPalindrome(slechteen) shouldBe false
    IsPalindrome.isPalindrome(slechttwee) shouldBe false
    IsPalindrome.isPalindrome(slechtdrei) shouldBe false
    IsPalindrome.isPalindrome(goedNull) shouldBe true
    IsPalindrome.isPalindrome(slechtvier) shouldBe false
