ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "algorithm-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest_2.13" % "3.0.8" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck_2.13" % "1.14.0" % Test
libraryDependencies += "org.typelevel" %% "cats-core_2.13" % "2.0.0" % Test
libraryDependencies += "org.typelevel" %% "cats-effect_2.13" % "2.0.0" % Test