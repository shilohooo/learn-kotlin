plugins {
    kotlin("jvm")
}

group = "com.github.shiloh"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.kotlinxDatetime)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}