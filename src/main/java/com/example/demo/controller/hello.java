package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
    @GetMapping("zly")
    public String GetHello(){
        return "good";
    }
    @GetMapping
    public String GetPet(){
        return "cat";
    }
    public String test_stream(){

        return "0";
    }
}
