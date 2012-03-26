name := "UnsynchBankScala"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"
