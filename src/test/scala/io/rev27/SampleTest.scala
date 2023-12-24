package io.rev27

import munit.FunSuite

class SampleTest extends FunSuite:
  test("foo increments by forty-two"):
    val nbr = 1
    val result = Sample.foo(nbr)
    val expected = 43
    assertEquals(result, expected)
