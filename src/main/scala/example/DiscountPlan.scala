package example

sealed trait DiscountPlan

object DiscoutPlan {
  case object CinemaCitizen extends DiscountPlan
  case object MiCard extends DiscountPlan
}
