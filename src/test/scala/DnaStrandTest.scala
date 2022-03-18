import org.scalatest._
import flatspec._
import matchers.should._

class DnaStrandTest extends AnyFlatSpec with Matchers {
  "DNAStrand(\"AAAA\")" should "return TTTT" in {
    DnaStrand.makeComplement("AAAA") should be ("TTTT")
  }
  "DNAStrand(\"ATTGC\")" should "return TAACG" in {
    DnaStrand.makeComplement("ATTGC") should be ("TAACG")
  }
  "DNAStrand(\"GTAT\")" should "return CATA" in {
    DnaStrand.makeComplement("GTAT") should be ("CATA")
  }
}
