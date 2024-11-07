plugins {
    java
    kotlin("jvm") version "2.0.20"
    id("org.jetbrains.intellij") version "1.17.4"
}

group = "love.forte.plugin"
version = "0.0.1"

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.3.1")
    downloadSources.set(true)
    updateSinceUntilBuild.set(false)
}

// patchPluginXml {
    // intellij.updateSinceUntilBuild = false
// }
