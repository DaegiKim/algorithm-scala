package exes_and_ohs

import org.scalatest._

object ExesAndOhs {

  def xo(str: String): Boolean = {
    str.toLowerCase.count(a => a.equals('o')) == str.toLowerCase.count(a => a.equals('x'))
  }
}

class ExesAndOhsTest extends FlatSpec with Matchers {

  val tests = List(
    ("xo", true),
    ("xo0", true),
    ("xxxoo", false)
  )

  tests.foreach {
    case (input, expected) =>
      s"xo($input)" should s"return $expected" in {
        ExesAndOhs.xo(input) should be (expected)
      }
  }
}
