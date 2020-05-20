enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.13.2"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.5"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.5"

scalacOptions += "-Ymacro-annotations"

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))