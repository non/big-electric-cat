name := "big-electric-cat"

organization := "org.spire-math"

version := "0.0.1"

scalaVersion := "2.10.5"

resolvers ++= Seq(
  "bintray/non" at "http://dl.bintray.com/non/maven",
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  "org.spire-math" %% "cats-core" % "0.1.0-SNAPSHOT",
  "org.spire-math" %% "cats-std" % "0.1.0-SNAPSHOT",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test",
  "org.scalatest" %% "scalatest" % "2.1.3" % "test",
  "org.apache.spark" %% "spark-core" % "1.4.0"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yinline-warnings",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

fork in Test := true
