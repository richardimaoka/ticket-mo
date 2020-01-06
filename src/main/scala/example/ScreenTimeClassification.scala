package example

sealed trait ScreenTimeClassification

object ScreenTimeClassification {
  case object DayTime extends ScreenTimeClassification
  case object NightTime extends ScreenTimeClassification
}
