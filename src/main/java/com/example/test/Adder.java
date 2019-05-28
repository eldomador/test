package com.example.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Adder {


    @GetMapping("/")
    public int add(int number1, int number2) {
        return number1 + number2;
    }
}
