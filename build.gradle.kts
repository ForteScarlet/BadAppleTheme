import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    java
    // kotlin("jvm") version "2.0.20"
    id("org.jetbrains.intellij.platform") version "2.1.0"
}

group = "love.forte.plugin"
version = "0.0.2"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

java {
    toolchain {
        this.languageVersion = JavaLanguageVersion.of(21)
    }
}

// kotlin {
//     jvmToolchain(21)
//     compilerOptions {
//         this.noJdk = true
//     }
// }

dependencies {
    intellijPlatform {
        // IntelliJ Platform Properties -> https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html#configuration-intellij-extension
        create("IC", "2024.1.7")
        // create("IC", "2023.3.8")

        instrumentationTools()
        pluginVerifier()
        zipSigner()
        testFramework(TestFrameworkType.Platform)
    }
}

intellijPlatform {
    pluginConfiguration {
        version = project.version.toString()

        description = """
            Bad Apple theme! 
            <i>Enjoy</i> your coding in the black and white ‘Stage 3’ shadow painting!
        """.trimIndent()

        ideaVersion {
            sinceBuild = "233"
            //untilBuild = "243.*"
        }

    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}

