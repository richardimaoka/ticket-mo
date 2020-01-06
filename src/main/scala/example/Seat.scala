package example

trait Seat {
  val theaterId: Theater
  val theater: Theater
}

object Seat {
  case class Id(value: String) extends AnyVal
}