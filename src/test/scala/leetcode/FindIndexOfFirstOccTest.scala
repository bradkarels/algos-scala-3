package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FindIndexOfFirstOccTest extends AnyFlatSpec with should.Matchers:
  "Needle" should "Be found in haystack" in:
    val haystack0 = "sadbutsad"
    val needle0 = "sad"
    val expectedIdx0 = 0

    val haystack1 = "leetcode"
    val needle1 = "leeto"
    val expectedIdx1 = -1

    val haystack2 = ("leetcode" * 5) + "floof" + "abcdefg"
    val needle2 = "floof"
    val expectedIdx2 = 40

    val haystack3 = ("leetcode" * 500) + "floof" + ("abcdefg" * 500)
    val needle3 = "floof"
    val expectedIdx3 = 4000

    val haystack4 = ("abcdefg" * 500) + "gfedcba" + ("abcdefg" * 500)
    val needle4 = "amanaplanacanalpanama"
    val expectedIdx4 = -1

    FindIndexOfFirstOcc.strStr(haystack0, needle0) shouldBe expectedIdx0
    FindIndexOfFirstOcc.strStr(haystack1, needle1) shouldBe expectedIdx1
    FindIndexOfFirstOcc.strStr(haystack2, needle2) shouldBe expectedIdx2
    FindIndexOfFirstOcc.strStr(haystack3, needle3) shouldBe expectedIdx3
    FindIndexOfFirstOcc.strStr(haystack4, needle4) shouldBe expectedIdx4
