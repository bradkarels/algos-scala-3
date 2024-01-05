package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class LenLastWordTest extends AnyFlatSpec with should.Matchers:
  "len last word" should "be five" in:
    val result = LenLastWord.lengthOfLastWord("Hello World")
    result shouldBe 5

  "len last word" should "be four" in:
    val result = LenLastWord.lengthOfLastWord("   fly me   to   the moon  ")
    result should === (4)

  "len last word" should "be six" in:
    val result = LenLastWord.lengthOfLastWord("""luffy is still joyboy""")
    result should be (6)

  "recursive len last word" should "be five" in :
    val result = LenLastWord.rLengthOfLastWord("Hello World")
    result shouldBe 5
  
  "recursive len last word" should "be four" in :
    val result = LenLastWord.rLengthOfLastWord("   fly me   to   the moon  ")
    result should ===(4)
  
  "recursive len last word" should "be six" in :
    val result = LenLastWord.rLengthOfLastWord("""luffy is still joyboy""")
    result should be(6)
