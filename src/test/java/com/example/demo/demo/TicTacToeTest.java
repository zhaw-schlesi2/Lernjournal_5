package com.example.demo.demo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TicTacToeTest {
        
    @Test
    public void TicTacToeTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        assertTrue(ticTacToe(1,1));
    } 
    
}