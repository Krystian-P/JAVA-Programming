package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is my String";
        System.out.println(myString);
        myString = myString+",and this is more.";
        System.out.println(myString);
        myString=myString+" \u00A9 2019";
        System.out.println(myString);
        String numberString="350";
        numberString = numberString+"49.55";
        System.out.println(numberString);
        String lastString =  "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println("lastString is equal to "+lastString);

        double doubleNumber = 120.32d;
        lastString = lastString+doubleNumber;
        System.out.println("lastString is equal to "+lastString);
    }
}