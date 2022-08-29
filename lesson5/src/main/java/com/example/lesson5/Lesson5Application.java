package com.example.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Lesson5Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson5Application.class, args);
    }

}
