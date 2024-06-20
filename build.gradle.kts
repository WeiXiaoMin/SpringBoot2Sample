plugins {
    id("org.springframework.boot") version "2.3.12.RELEASE"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.72"
}

allprojects {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        mavenCentral()
    }
}