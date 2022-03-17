object Shortest {

  def findShort(str: String): Int = {
    str.split(" ").map(a => a.length).min
  }
}