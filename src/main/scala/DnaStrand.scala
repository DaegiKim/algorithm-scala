object DnaStrand {
  def makeComplement(dna: String): String = {
    dna.map {
        case 'A' => 'T'
        case 'T' => 'A'
        case 'C' => 'G'
        case 'G' => 'C'
      }
  }
}
