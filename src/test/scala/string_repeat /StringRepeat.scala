package string_repeat

import org.scalatest.{FlatSpec, Matchers}

object StringRepeat {
  def repeatStr(times: Int, str: String): String = {
    str*times
  }
}

class StringRepeatSpec extends FlatSpec {
  "repeatStr method given counter is 3 and string *" should " return string ***" in {
    assert(StringRepeat.repeatStr(3, "*") == "***")
  }
}
