package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LongestSubstringWithoutRepeatingCharsTest extends AnyFlatSpec with should.Matchers:

  behavior of "LongestSubstringWithoutRepeatingCharsTest"

  it should "lengthOfLongestSubstring" in:
    val input0 = "abcabcbb"
    val expected0 = 3
    val input1 = "bbbbb"
    val expected1 = 1
    val input2 = "pwwkew"
    val expected2 = 3
    true should be (true)

    LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input0) should === (expected0)
    LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input1) should === (expected1)
    LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input2) should === (expected2)
