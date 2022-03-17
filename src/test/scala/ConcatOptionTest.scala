import org.scalatest._
import flatspec._
import matchers.should._

class ConcatOptionTest extends AnyFlatSpec with Matchers {
  it should "work with example tests" in {
    assert(ConcatOption.concatOption(Some("Hello"), Some("World")) == Some("Hello World"))
    assert(ConcatOption.concatOption(Some("Hello"), None) == None)
    assert(ConcatOption.concatOption(None, Some("World")) == None)
  }
}
