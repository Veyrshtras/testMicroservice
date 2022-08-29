package com.example.lesson1.controller;

import com.example.lesson1.model.TestContent;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jdi.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("test")
public class TestController {

    private final MessageSource messageSource;

    public TestController(@Qualifier("my") MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public ResponseEntity test(String hello ){

        return ResponseEntity.ok(new TestContent(messageSource.getMessage("hello",null, new Locale(hello))));
    }
}
