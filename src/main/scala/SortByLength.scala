object SortByLength {
  def sortByLength(arr: Array[String]): Array[String] = {
    arr.sortBy(_.length)
  }
}
