
name := sys.env.get("APP_NAME").getOrElse("$name$") // the project's name
version := sys.env.get("APP_VERSION").getOrElse("0.1") // the application version
scalaVersion := sys.env.get("SCALA_FULL_VERSION").getOrElse("$scala_version$.0") // version of Scala we want to use (this should be in line with the version of Spark framework)
organization := "com.osekoo.dev"

val sparkVersion = sys.env.get("SPARK_VERSION").getOrElse("$spark_version$")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided"
)
