package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicesSpringJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingController.class, args);
    }

}
