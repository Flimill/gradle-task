plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

group = "ru.example"
version = "1.01"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("com.google.guava:guava:31.0.1-jre")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.0")
}

tasks.test {
    useJUnitPlatform()
}