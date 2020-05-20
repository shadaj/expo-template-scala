package hello.world

import slinky.hot

import scala.scalajs.LinkingInfo
import scala.scalajs.js.annotation.JSExportTopLevel

object Main {
  if (LinkingInfo.developmentMode) {
    hot.initialize()
  }
  
  @JSExportTopLevel("app")
  val app = App.componentConstructor
}
