package com.example.paymentsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(method = RequestMethod.GET,path = "/get")
    public ResponseEntity get(){
        return ResponseEntity.ok("hi guys....");
    }
}
