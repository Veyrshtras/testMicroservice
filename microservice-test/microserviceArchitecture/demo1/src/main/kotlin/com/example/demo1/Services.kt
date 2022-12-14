package com.example.demo1

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Service
@FeignClient("demo2")
interface Demo2Services {

    @GetMapping
    fun hello():String

    @PostMapping("message/{id}")
    fun message(@PathVariable id: Long):MessageDto
}