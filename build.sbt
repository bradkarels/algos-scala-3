ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "algos-scala-3",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "toolkit-test" % "0.1.7" % Test,
      "org.scalactic" %% "scalactic" % "3.2.17",
      "org.scalatest" %% "scalatest" % "3.2.17" % Test
    )
  )
