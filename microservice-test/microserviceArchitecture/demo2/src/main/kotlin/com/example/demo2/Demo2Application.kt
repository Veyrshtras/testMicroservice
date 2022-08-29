package com.example.demo2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableResourceServer
class Demo2Application

fun main(args: Array<String>) {
    runApplication<Demo2Application>(*args)
}


@RestController
class TestController{

    @GetMapping
    fun hello()="hello from demo_2"

    @PostMapping("message/{id}")
    fun message(@PathVariable id: Long, )=MessageDto(id, "sending from Demo2")


}

@Configuration
class ResourceServerConfig: ResourceServerConfigurerAdapter(){
    override fun configure(http: HttpSecurity?) {
        http?.requestMatchers()
            ?.and()
            ?.authorizeRequests()
            ?.antMatchers("/")?.permitAll()
            ?.antMatchers("/**")?.authenticated()
    }

    @Bean
    @LoadBalanced
    fun oauth2RestTemplate( userInfoRestTemplateFactory: UserInfoRestTemplateFactory): OAuth2RestTemplate {
        return userInfoRestTemplateFactory.userInfoRestTemplate
    }
}