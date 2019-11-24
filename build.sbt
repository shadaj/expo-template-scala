enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.13.1"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.3"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.3"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

scalaJSModuleKind := ModuleKind.CommonJSModule
