package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer Minimum Value = " + myMinIntValue);
        System.out.println("integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = "+(myMaxIntValue+1));
        System.out.println("Busted MIN Value = "+(myMinIntValue-1));

        //int myMaxIntTest=2_147_483_648; Out of Range

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Minimum Value = " + myMinByteValue);
        System.out.println("byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue=2_147_483_648L;
        System.out.println(bigLongLiteralValue);

        //Casting

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        //Exercise.1

        byte byteValue = 22;
        short shortValue = 200;
        int intValue = 123444;

        long finalValue = 50000L+10L*(byteValue+shortValue+intValue);
        System.out.println(finalValue);

        short shortTotal =(short) (1000+10*(byteValue+shortValue+intValue));
        System.out.println(shortTotal);
    }
}
