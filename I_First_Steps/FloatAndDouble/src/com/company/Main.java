package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Max value "+myMaxFloatValue);
        System.out.println("Float Min value "+myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Max value "+myMaxDoubleValue);
        System.out.println("Double Min value "+myMinDoubleValue);

        int myIntValue = 5/3;
        float myFloutValue=5f/3;
        double myDoubleValue=5d/3;
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloutValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);

        //Challenge
        double myPoundNumber= 3;
        double toKilograms=myPoundNumber*0.45359237;
        System.out.println(myPoundNumber+" pounds is equal to "+ toKilograms +" kilograms");
        //Done

        double pi = 3.1415927d;
        double anotherNumber = 2000000.3231444d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
