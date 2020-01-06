package example

sealed trait VisualEffects

object VisualEffects {
  case object Visual2D extends VisualEffects
  case object Visual3D extends VisualEffects
}


