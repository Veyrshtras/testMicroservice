package com.example.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@SpringBootApplication
@EnableConfigServer
@EnableWebSecurity
class ConfigApplication

fun main(args: Array<String>) {
    runApplication<ConfigApplication>(*args)
}

@Configuration
class SecurityConfig: WebSecurityConfigurerAdapter(){
    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()
            ?.anyRequest()
            ?.authenticated()
            ?.and()
            ?.httpBasic()
    }
}