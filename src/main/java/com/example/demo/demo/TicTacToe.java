package com.example.demo.demo;

public class TicTacToe {
    String[] map = new String[9];


    public String play(int player, int field) {
        int i = 0;

        map[field] = Integer.toString(player);
        
        return Integer.toString(player) + "," + Integer.toString(field);
    } 
}