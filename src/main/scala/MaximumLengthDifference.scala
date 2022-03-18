object MaximumLengthDifference {
  def mxdiflg(a1: List[String], a2: List[String]): Int = {
    if (a1.isEmpty || a2.isEmpty) return -1

    Math.max(
      Math.abs(a1.minBy(_.length).length - a2.maxBy(_.length).length),
      Math.abs(a1.maxBy(_.length).length - a2.minBy(_.length).length)
    )
  }
}
