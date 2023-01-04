package com.ridha.djangoh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")
    public String getData(){
        return "in django-h project";
    }
}
