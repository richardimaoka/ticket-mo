package example

sealed trait DayClassification

object DayClassification {
  case object WeekDay extends DayClassification
  case object WeekendOrHoliday extends DayClassification
}
