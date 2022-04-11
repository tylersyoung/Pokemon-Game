plugins {
    application
    id("java")
    kotlin("jvm") version "1.6.0"
}

group = "hamper"
version = "1.0-SNAPSHOT"

val run: JavaExec by tasks
run.standardInput = System.`in`

val main = "pokemon.Main"

application {
    mainClass.set(main)
    applicationDefaultJvmArgs = listOf("-Dfile.encoding=UTF-8")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.6.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks {
    test {
        useJUnitPlatform()
    }

    wrapper {
        gradleVersion = "7.0.0"
        distributionType = Wrapper.DistributionType.BIN
    }
}
