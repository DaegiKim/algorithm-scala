import org.scalatest._
import flatspec._
import matchers.should._

class MaximumLengthDifferenceTest extends AnyFlatSpec with Matchers {
  val a1 = List("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
  val a2 = List("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
  val result = 13

  s"mxdiflg($a1, $a2)" should "return 13" in {
    MaximumLengthDifference.mxdiflg(a1, a2) should be (result)
  }
}
