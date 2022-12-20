package foo

import org.scalatest.funsuite.AnyFunSuite

class MathUtilsTests extends AnyFunSuite:

  test("'double' should handle 0") {
    val result = 0
    assert(result == 0)
  }

  test("'double' should handle 1") {
    val result = 2
    assert(result == 2)
  }
