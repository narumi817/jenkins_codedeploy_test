name := "Hello World"

version := "1.0"

scalaVersion := "2.11.0"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
jarName in assembly := "hello_world.jar"
