plugins {
    java
    kotlin("jvm") version "2.0.20"
    id("org.jetbrains.intellij") version "1.17.4"
}

group = "love.forte.ide"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2020.1")
}

// patchPluginXml {
    // intellij.updateSinceUntilBuild = false
// }
