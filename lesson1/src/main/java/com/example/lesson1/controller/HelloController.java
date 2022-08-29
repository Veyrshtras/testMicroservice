package com.example.lesson1.controller;

import com.example.lesson1.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpConstraint;

@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping
    public ResponseEntity sayHello(@RequestParam(required = false, defaultValue = "Spring Boot") String name ){
        Post p=new Post();
        p.setTitle("name");
        p.setId(1L);
        p.setContent("Hello "+name);
        return ResponseEntity.ok(p.getContent());
    }
}
