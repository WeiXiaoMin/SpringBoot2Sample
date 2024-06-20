package com.example.springboot2sample

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @RequestMapping("/home")
    fun home(): String {
        return "Hello Spring Boot 2!!"
    }
}