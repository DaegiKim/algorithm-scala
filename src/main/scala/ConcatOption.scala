object ConcatOption {
  def concatOption(first: Option[String], second: Option[String]) = {
    for {
      a <- first
      b <- second
    } yield {
      s"$a $b"
    }
  }
}
