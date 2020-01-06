package example

trait Booking {
  val showId: MovieShow.Id
  val seatId: Seat.Id
  val discountPlan: DiscountPlan
}
