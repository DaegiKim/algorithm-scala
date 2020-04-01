package persistent_bugger

import org.scalatest._

object Multiplication {

  def product(n: Int): Int = {
    n.toString.split("").map(a => a.toInt).product
  }

  def persistence(n: Int): Int = {
    var a = n
    var i = 0
    while (a >= 10) {
      a = product(a)
      i+=1
    }
    i
  }
}

class MatrixTest extends FlatSpec with Matchers {

  val tests = List(
    (39, 3),
    (4, 0),
    (25, 2),
    (999, 4)
  )

  tests.foreach {
    case (input, expected) =>
      s"determinant($input)" should s"return $expected" in {
        Multiplication.persistence(input) should be (expected)
      }
  }
}
