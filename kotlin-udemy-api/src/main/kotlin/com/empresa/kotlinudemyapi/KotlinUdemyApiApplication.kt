package com.empresa.kotlinudemyapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.empresa.kotlinudemyapi")
class KotlinUdemyApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinUdemyApiApplication>(*args)
}
