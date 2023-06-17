package com.example.firstboot

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/")
    fun hello() = "Hello World"
}