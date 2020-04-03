enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "app"

scalaVersion := "2.13.1"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.4+2-3c8aef65"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.4+2-3c8aef65"

scalacOptions += "-Ymacro-annotations"

