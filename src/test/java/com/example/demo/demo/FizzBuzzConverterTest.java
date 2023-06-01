package com.example.demo.demo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FizzBuzzConverterTest {
        
    @Test
    public void fizzBuzzConverter1() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("1", fizzBuzz.convert(1));
    } 
    @Test
    public void fizzBuzzConvertor2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("2", fizzBuzz.convert(2));
    }
    @Test
    public void fizzBuzzConvertor3() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }
    @Test
    public void fizzBuzzConvertorMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzz.convert(6));
    }
    @Test
    public void fizzBuzzConvertorMultiplesOfSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzz.convert(7));
    }
}