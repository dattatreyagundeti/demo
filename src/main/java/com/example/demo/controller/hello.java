package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping()
    public String hello(){
        return "hello world"    ;
    }

    @GetMapping("/bye")
    public String    bye(){
        return      "bye world";
    }
}
