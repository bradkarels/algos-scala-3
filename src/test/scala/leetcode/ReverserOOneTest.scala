package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ReverserOOneTest extends AnyFlatSpec with should.Matchers:

  behavior of "ReverserOOneTest"

  it should "reverseString" in:
    val hello = "hello".toCharArray
    val olleh = "olleh".toCharArray
    ReverserOOne.reverseString(hello)
    hello should === (olleh)

  it should "reverse another" in:
    val Hannah = "Hannah".toCharArray
    val hannaH = "hannaH".toCharArray
    ReverserOOne.reverseString(Hannah)
    Hannah should === (hannaH)

  it should "reverse a third thing" in:
    val opJeJas = "Op je jas!!!".toCharArray
    val saJeJpo = "!!!saj ej pO".toCharArray
    ReverserOOne.reverseString(opJeJas)
    opJeJas eq saJeJpo


