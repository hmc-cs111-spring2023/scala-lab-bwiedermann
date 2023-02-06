import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class FactorialTest extends AnyFunSuite with Matchers:

  test("0!") {
   fact(0) should be (1)
  }

  test("1!") {
    fact(1) should be (1)
  }

  test("2!") {
    fact(2) should be (2)
  }

  test("3!") {
    fact(3) should be (6)
  }

  test("4!") {
    fact(4) should be (24)
  }

end FactorialTest
