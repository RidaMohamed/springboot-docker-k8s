package com.ridha.djangoh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")
    public String getData(){
        return "in django-h project";
    }

    @GetMapping("/test-docker-2")
    public String getDataTwo(){
        return "in django-h  path 2";
    }
}
