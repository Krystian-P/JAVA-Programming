package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        String playerName="Derek";
        int playerScore = 500;
        int position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalSocore = score + (levelCompleted * bonus);
            finalSocore += 1000;
            return finalSocore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+ position +" on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        int position;
        if(score >= 1000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;
        else position = 4;
        return position;
    }
}
