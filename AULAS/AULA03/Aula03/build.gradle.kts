plugins {
    kotlin("jvm") version "2.2.0"
    application
}

group = "org.fatec"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(24)
}

application {
    // Define a classe principal do seu projeto
    mainClass.set("org.fatec.MainKt")
}
