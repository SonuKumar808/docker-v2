package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/message")
    public String getMessage() {
        return "🚀 Boom! Jenkins CI/CD pipeline has been successfully configured!!!";
    }
}
