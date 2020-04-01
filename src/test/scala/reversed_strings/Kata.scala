package reversed_strings

import org.scalatest._

object Kata {
  def solution(word: String): String = {
    word.reverse
  }
}

class ReversedStringTest extends FlatSpec with Matchers {
  "Kata.solution" should "pass fixed tests" in {
    Kata.solution("dlrow") should equal ("world")
  }
}
