package org.ergoplatform.settings

final case class Args(userConfigPathOpt: Option[String],
                      networkTypeOpt: Option[NetworkType])

object Args {
  def empty: Args = Args(None, None)
}
