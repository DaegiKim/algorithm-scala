import org.scalatest._
import flatspec._
import matchers.should._

class ShortestTest extends AnyFlatSpec with Matchers {

  val tests = List(
    ("bitcoin take over the world maybe who knows perhaps", 3),
    ("turns out random test cases are easier than writing out basic ones", 3),
    ("lets talk about javascript the best language", 3),
    ("i want to travel the world writing code one day", 1),
    ("Lets all go on holiday somewhere very cold", 2)
  )

  tests.foreach {
    case (input, expected) =>
      s"findShort(\"$input\")" should s"return $expected" in {
        Shortest.findShort(input) shouldBe expected
      }
  }
}