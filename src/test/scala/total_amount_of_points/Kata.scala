package total_amount_of_points

import org.scalatest._

object Kata {
  def points(games: Vector[String]): Int = {
    games.map(score => {
      val scores = score.split(':').map(s => s.toInt)
      if (scores(0) > scores(1)) {
        3
      } else if (scores(0) < scores(1)) {
        0
      } else {
        1
      }
    }: Int).sum
  }
}

class KataSpec extends FunSpec with Matchers {
  describe("Example Tests: ") {
    it("Should run") {
      assert(Kata.points(Vector("1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3")) == 30)
      assert(Kata.points(Vector("1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4")) == 10)
      assert(Kata.points(Vector("0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4")) == 0)
      assert(Kata.points(Vector("1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4")) == 15)
      assert(Kata.points(Vector("1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4")) == 12)
    }
  }
}
