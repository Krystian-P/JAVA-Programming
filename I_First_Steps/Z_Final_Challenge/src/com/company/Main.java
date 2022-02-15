package com.company;

public class Main {

    public static void main(String[] args) {

        double finaleValue;
        double myFirstDoubleValue = 20d; //step 1
        double mySecondDoubleValue = 80d; //step 2

        finaleValue= (myFirstDoubleValue + mySecondDoubleValue) * 100; // step 3
        finaleValue = finaleValue % 40; // step 4
        System.out.println(finaleValue);

        boolean isReminderZero;
        isReminderZero = (finaleValue==0) ? true : false; // step 5
        System.out.println(isReminderZero); // step 6

        if (!isReminderZero){
            System.out.println("Got some remainder");
        }// step 7
    }
}
