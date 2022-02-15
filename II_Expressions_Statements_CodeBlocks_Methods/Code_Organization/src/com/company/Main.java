package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is test");

        System.out.println("This is"+
                "another"+
                "test");
        int anotherVariable = 50; anotherVariable--; System.out.println("This is another one"); //not recommended

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000){
            System.out.println("Your score was 5000 but greater than 1000"); // Code block
        } else if (score < 1000){
            System.out.println("Your score was less than 1000"); // Code block
        } else{
            System.out.println("Got here"); // Code block
        }

        if (gameOver == true){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore); // Code block
        }

//        int savedFinalScore = finalScore; Can't access  variables inside code block

        //Challenge

        score = 10000;
        levelCompleted =8;
        bonus =200;

        if (gameOver == true){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
