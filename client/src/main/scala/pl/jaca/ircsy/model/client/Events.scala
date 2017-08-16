package pl.jaca.ircsy.model.client

object Events {

  sealed trait Event

  object Disconnected extends Event

  object Connected extends Event

  case class JoinedChannel(channel: String) extends Event

  case class LeftChannel(channel: String) extends Event

  case class ReceivedChannelMessage(channel: String, msg: String) extends Event

  case class ReceivedPrivateMessage(sender: String, msg: String) extends Event

  // Failures

  sealed trait FailureEvent

  case class FailedToConnect(cause: Throwable) extends FailureEvent

  case class FailedToJoinChannel(channel: String, cause: Throwable) extends FailureEvent

}
