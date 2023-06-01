package com.example.demo.demo;

public class TicTacToe {
    String[] map = new String[10];
    int lastPlayer = 3;
    boolean win = false;
    int playerWin = 3;


    public String play(int player, int field) {
        //Checks
        if(player != 1 && player != 2) {
            return "not allowed"; 
        } else if (field < 1 || field > 9) {
            return "not allowed"; 
        }else if (field < 1 || field > 9) {
            return "not allowed"; 
        } else if (player == lastPlayer) {
            return "not allowed"; 
        }
        else if (map[field] != null)  {
            return "not allowed"; 
        } else if(win) {
            if(playerWin==1){
                return "2,lose";
            } else {
                return "1,lose";
            }
        }

        map[field] = Integer.toString(player);
        lastPlayer = player;

        for(int i = 1; i <= 2; i++) {
            if(map[1] != null && map[5] != null && map[9] != null && map[1].compareTo(Integer.toString(i)) == 0 && map[5].compareTo(Integer.toString(i)) == 0 && map[9].compareTo(Integer.toString(i)) == 0){
                win=true;
                playerWin=i;
                return Integer.toString(i) +",win";
            }
        }

            return Integer.toString(player) + "," + Integer.toString(field);
 
    } 
}