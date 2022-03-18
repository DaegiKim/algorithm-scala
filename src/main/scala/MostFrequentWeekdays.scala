import java.time.LocalDate

object MostFrequentWeekdays {
  def mostFrequentDays(year: Int): List[String] = {
    val date = LocalDate.of(year, 1, 1)

    val days = if (date.isLeapYear) {
      365
    } else {
      364
    }

    (0 to days)
      .map(it => {
        date.plusDays(it).getDayOfWeek
      })
      .groupBy(identity)
      .map(it => (it._1, it._2.size))
      .toList
      .sortBy(_._2)
      .reverse
      .take(days - 363)
      .sortBy(_._1.getValue)
      .map(it => it._1.name().toLowerCase.capitalize)
  }
}
