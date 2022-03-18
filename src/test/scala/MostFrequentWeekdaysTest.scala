import org.scalatest._
import flatspec._
import matchers.should._

import java.time.LocalDate

class MostFrequentWeekdaysTest extends AnyFlatSpec with Matchers {
  it should "work with example tests" in {
    assert(MostFrequentWeekdays.mostFrequentDays(2427) == List("Friday"))
    assert(MostFrequentWeekdays.mostFrequentDays(2185) == List("Saturday"))
    assert(MostFrequentWeekdays.mostFrequentDays(1770) == List("Monday"))
    assert(MostFrequentWeekdays.mostFrequentDays(2860) == List("Thursday", "Friday"))
    assert(MostFrequentWeekdays.mostFrequentDays(1785) == List("Saturday"))
  }
}
