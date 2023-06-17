package com.example.firstboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstbootApplication

fun main(args: Array<String>) {
	runApplication<FirstbootApplication>(*args)
}
