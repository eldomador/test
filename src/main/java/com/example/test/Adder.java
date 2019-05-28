package com.example.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Adder {

    public int add(int number1, int number2) {
        return number1 + number2;
    }
}
