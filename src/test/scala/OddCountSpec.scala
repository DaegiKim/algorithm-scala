import org.scalatest._
import flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OddCountSpec extends AnyFlatSpec with Matchers {

  "oddCount(15)" should "return 7" in {
    OddCount.oddCount(15) should be (7)
  }

  "oddCount(15023)" should "return 7511" in {
    OddCount.oddCount(16911145820L) should be (8455572910L)
  }
}