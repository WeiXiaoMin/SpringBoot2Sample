package com.example.springboot2sample

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LibrarySampleController {

    @RequestMapping("/library")
    fun library(): String {
        return "Hello Spring Boot 2 Library!!"
    }
}