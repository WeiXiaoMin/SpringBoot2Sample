buildscript {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        gradlePluginPortal()
    }
}

plugins {
    id("org.springframework.boot") version "2.3.12.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    id("org.jetbrains.kotlin.jvm") version "1.3.72" apply false
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.72" apply false
}

allprojects {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        mavenCentral()
    }
}