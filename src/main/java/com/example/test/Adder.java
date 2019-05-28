package com.example.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Adder
{
    @GetMapping
    public String hello()
    {
        return "Hello world!";
    }
}
