import org.scalatest._
import flatspec._
import matchers.should._

class SortByLengthTest extends AnyFlatSpec with Matchers {
  val tests = List(
    (Array("i", "to", "beg", "life"), Array("beg", "life", "i", "to")),
    (Array("", "pizza", "brains", "moderately"), Array("", "moderately", "brains", "pizza")),
    (Array("short", "longer", "longest"), Array("longer", "longest", "short")),
    (Array("a", "of", "dog", "food"), Array("dog", "food", "a", "of")),
    (Array("", "bees", "eloquent", "dictionary"), Array("", "dictionary", "eloquent", "bees")),
    (Array("a short sentence", "a longer sentence", "the longest sentence"), Array("a longer sentence", "the longest sentence", "a short sentence")),
  )

  tests.foreach {
    case (expected, input) =>
      s"sortByLength(Array(${input.mkString(",")}))" should s"return Array(${expected.mkString(",")})" in {
        SortByLength.sortByLength(input) should be (expected)
      }
  }

}
