lazy val root = project.in(file(".")).enablePlugins(SbtIdeaPlugin)

ideaBuild in ThisBuild := "15.0"

ideaDownloadDirectory in ThisBuild := baseDirectory.value / "idea"

ideaDownloadSources in ThisBuild := false
