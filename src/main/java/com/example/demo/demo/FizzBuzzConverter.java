package com.example.demo.demo;

public class FizzBuzzConverter {
    public String convert(int i) {
        if (i % 3 == 0) {
        return "Fizz";
        } else if (i % 7 == 0) {
        return "Buzz";
        }
        return String.valueOf(i);
    }
}
