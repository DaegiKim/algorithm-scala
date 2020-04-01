package growth_of_a_population

import org.scalatest._
import org.scalatest.Assertions._
import ArgeTest._

object Arge {

  def nbYear(p0: Int, percent: Double, aug: Int, p: Int): Int = {
    (p0 + (p0 * percent/100) + p/aug).toInt
  }
}

class ArgeTest extends FlatSpec {
  it should "pass Basic tests" in {
    testing(1500, 5, 100, 5000, 15)
    testing(1500000, 2.5, 10000, 2000000, 10)

  }
}

object ArgeTest {
  def testing(p0: Int, percent: Double, aug: Int, p: Int, expect: Int): Unit = {
    val actual = Arge.nbYear(p0, percent, aug, p)
    assertResult(expect){actual}
  }
}
