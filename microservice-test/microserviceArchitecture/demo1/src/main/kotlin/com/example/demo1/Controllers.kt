package com.example.demo1

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controllers(@Qualifier("com.example.demo1.Demo2Services") private val services: Demo2Services) {

    @GetMapping("get")
    fun hello()="hello from demo_1 ${services.hello()}"


    @GetMapping("message")
    fun message(id: Long)=services.message(id)


}