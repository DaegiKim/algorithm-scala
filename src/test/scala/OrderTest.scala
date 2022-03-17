import org.scalatest._
import flatspec._
import matchers.should._

class OrderTest extends AnyFlatSpec with Matchers {
  "Order.desdendingOrder(0)" should "return 0" in {
    Order.descendingOrder(0) should be (0)
  }

  "Order.desdendingOrder(51)" should "return 15" in {
    Order.descendingOrder(15) should be (51)
  }

  "Order.desdendingOrder(123456789)" should "return 987654321" in {
    Order.descendingOrder(123456789) should be (987654321)
  }
}
