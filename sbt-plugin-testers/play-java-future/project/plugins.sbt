/*
 * Copyright (C) 2015-2017 Lightbend Inc. <https://www.lightbend.com>
 */
lazy val root = Project("plugins", file(".")).dependsOn(plugin)

lazy val plugin = ProjectRef(file("../../").getCanonicalFile.toURI, "plugin")
