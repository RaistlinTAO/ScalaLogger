
ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "logger",
    idePackagePrefix := Some("io.github.raistlintao.logger")
  )
