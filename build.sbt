
val toolkitV = "0.5.0"
val toolkit = "org.scala-lang" %% "toolkit" % toolkitV
val toolkitTest = "org.scala-lang" %% "toolkit-test" % toolkitV

ThisBuild / scalaVersion := "2.13.14"
libraryDependencies += toolkit
libraryDependencies += (toolkitTest % Test)
