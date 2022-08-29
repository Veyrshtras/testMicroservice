package com.example.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client

@SpringBootApplication
@EnableOAuth2Client
@EnableEurekaClient
class AuthApplication

fun main(args: Array<String>) {
    runApplication<AuthApplication>(*args)
}
