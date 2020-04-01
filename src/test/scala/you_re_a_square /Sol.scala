package you_re_a_square

import org.scalatest._

object Sol {

  def isSquare(x: Int): Boolean = {
    Math.sqrt(x).isValidInt
  }
}

class ExampleSpec extends FlatSpec with Matchers {
  val tests = List(
    (-1,  false),
    (0,   true),
    (3,   false),
    (4,   true),
    (25,  true),
    (26,  false)
  )

  tests.foreach {
    case (input, expected) =>
      s"isSquare($input)" should s"return $expected" in {
        Sol.isSquare(input) should be (expected)
      }
  }
}
