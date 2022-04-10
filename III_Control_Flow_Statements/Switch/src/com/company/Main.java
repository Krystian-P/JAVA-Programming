package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else {
//            System.out.println("Value was 2");
//        }

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("actually it was a"+ switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'D';

        switch (switchChar){
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Char is " + switchChar);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "JaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
