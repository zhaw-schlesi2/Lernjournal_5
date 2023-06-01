package com.example.demo.demo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TicTacToeTest {
        
    @Test
    public void TicTacToeTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        
        //Player 1 plays on field 1
        assertEquals("1,1", ticTacToe.play(1,1));

        //Player 2 plays on field 1, no double actions allowed
        assertEquals("not allowed", ticTacToe.play(2,1));

        //Player 3 plays on field 2, not allowed, only 2 players (1 and 2)
        assertEquals("not allowed", ticTacToe.play(3,2));

        //Player 2 plays on field 4
        assertEquals("2,4", ticTacToe.play(2,4));

        //Player 2 plays again on field 5, not allowed (double action)
        assertEquals("not allowed", ticTacToe.play(2,5));

        //Player 1 plays on field 5
        assertEquals("1,5", ticTacToe.play(1,5));

        //Player 2 plays on field 10, not allowed, only field 1-9
        assertEquals("not allowed", ticTacToe.play(2,10));

        //Player 2 plays on field 8
        assertEquals("2,8", ticTacToe.play(2,8));

        //Player 1 plays on field 9
        assertEquals("1,win", ticTacToe.play(1,9));

        //Player 2 plays on field 6, not allowed, game over
        assertEquals("2,lose", ticTacToe.play(2,6));
    } 
    
}