package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculatingScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculatingScore(75);
        calculatingScore();
    }

    public static int calculatingScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculatingScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    }

    public static int calculatingScore(){
        System.out.println("Unnamed player, no points");
        return 1;
    }
}
