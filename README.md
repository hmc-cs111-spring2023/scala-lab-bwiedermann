# In-class Scala lab

Let's write some Scala! Here's how to do the lab:

1.  Get the code (via GitHub classroom)
1.  Lauch the code in a Codespace
1.  Work on the lab. In general, you should look over any function documentation and
    tests, to understand what's required. Then run the tests, then write the code.
    - [ ] [`00_Factorial.scala`](./src/main/scala/lab/00_Factorial.scala)
    - [ ] [`01_Fibonacci.scala`](./src/main/scala/lab/01_Fibonacci.scala)
    - [ ] [`02_Exponent.scala`](./src/main/scala/lab/02_Exponent.scala)
    - [ ] [`03_Palindrome.scala`](./src/main/scala/lab/03_Palindrome.scala) (_bonus_)
    - [ ] [`04_Rainfall.scala`](./src/main/scala/lab/04_Rainfall.scala) (_bonus_)

## Running tests

### Running all the tests

1. Start up `sbt`
1. run the command `test` (to run the tests once) or `~test` to automatically rerun tests
   when the code chages.

### Running only one of the test files

In `sbt`, run the command `testOnly <TestClassName>`, for example, `testOnly FactorialTest`.

## Sample solution
You can look in our organization for a sample solution (under the username `bwiedermann`)!
