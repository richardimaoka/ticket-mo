package example

trait MovieShow {
  val id: MovieShow.Id
  val movieId: Movie.Id
  val dayClassification: DayClassification
  val screenTimeClassification: ScreenTimeClassification
  val visualEffects: VisualEffects
}

object MovieShow {
  case class Id(value: String) extends AnyVal
}