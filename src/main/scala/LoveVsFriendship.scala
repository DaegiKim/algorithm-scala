object LoveVsFriendship {
  def loveVsFriendship(s: String): Int = {
    s.toCharArray.map(_.toInt - 96).sum
  }
}
