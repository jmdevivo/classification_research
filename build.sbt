
lazy val commonSettings = Seq(
	organization := "com.johndevivo",
	version := "0.1.0",
	scalaVersion := "2.11.8"
)


lazy val root = (project in file(".")).
	settings(commonSettings: _*).
	settings(
		name := "StatClassifier"
	)
