import play.ebean.sbt.PlayEbean

name := """Decial"""
organization := "com.decial"

version := "1.0-SNAPSHOT"

lazy val root= (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(

 javaJdbc,
 javaJpa,
 cache,
 filters,
 evolutions,
 javaWs,
 "org.simpleframework" % "simple-xml" % "2.7.1",
 "br.com.moip" % "java-sdk" % "4.2.0",
 "mysql" % "mysql-connector-java" % "5.1.27"
)
