import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class ExponentTest extends AnyFunSuite with Matchers:
  test("n^0 = 1 for all n") {
    expt(0, 0) should be (1)
    expt(1, 0) should be (1)
    expt(2, 0) should be (1)
    expt(3, 0) should be (1)
  }
  
  test("n^1 = n for all n") {
    expt(0, 1) should be (0)
    expt(1, 1) should be (1)
    expt(2, 1) should be (2)
    expt(3, 1) should be (3)
  }
  
  test("n^2 == n*n for all n") {
    expt(0, 2) should be (0)
    expt(1, 2) should be (1)
    expt(2, 2) should be (4)
    expt(3, 2) should be (9)
  }

end ExponentTest
