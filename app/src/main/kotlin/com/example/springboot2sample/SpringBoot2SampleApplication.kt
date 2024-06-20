package com.example.springboot2sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.springboot2sample"])
class SpringBoot2SampleApplication

fun main(args: Array<String>) {
    runApplication<SpringBoot2SampleApplication>(*args)
}
