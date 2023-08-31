plugins {
    id("java")
}

group = "com.javarush"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("org.hibernate:hibernate-core-jakarta:5.6.15.Final")
    implementation("p6spy:p6spy:3.9.1")
    implementation("io.lettuce:lettuce-core:6.2.6.RELEASE")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}