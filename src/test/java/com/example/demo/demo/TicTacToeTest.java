package com.example.demo.demo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TicTacToeTest {
        
    @Test
    public void TicTacToeTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals("1,1", ticTacToe.play(1,1));
    } 
    
}