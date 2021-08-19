plugins {
    kotlin("jvm") version "1.5.10"
}

group = "illyalaifu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.+")
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.5+")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")

}

tasks.withType<Test> {
    useJUnitPlatform()
}