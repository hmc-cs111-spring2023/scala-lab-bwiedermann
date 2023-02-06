import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class FibonacciTest extends AnyFunSuite with Matchers:

  test("fib(1)") {
    fib(1) should be (1)
  }
  
  test("fib(2)") {
    fib(2) should be (1)
  }
  
  test("fib(5)") {
    fib(5) should be (5)
  } 

end FibonacciTest
