name := """example-app"""

version := "2.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "NaMach <naren.wins@gmail.com>"
packageSummary := "My Package"
packageDescription := "Package"
