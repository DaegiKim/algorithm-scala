package beginner_lost_without_a_map

import org.scalatest.FunSuite

object Kata {

  def maps(xs: List[Int]): List[Int] = xs.map(a => a*2)
}

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.maps(List(1, 2, 3)) === List(2, 4, 6))
    assert(Kata.maps(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) === List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18))
    assert(Kata.maps(List()) === List())
  }
}
