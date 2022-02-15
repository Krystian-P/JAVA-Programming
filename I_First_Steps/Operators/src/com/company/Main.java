package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1+2 equal "+result);
        int previousResult = result;
        System.out.println("previousResult = "+ previousResult);
        result= result-1; // 3 - 1 = 2
        System.out.println("3-1= "+result);
        System.out.println("previousResult = "+ previousResult);

        result = result *10; // 2 * 10 = 20
        System.out.println("2*10 = " + result);

        result = result /5;
        System.out.println("20/5 = "+result);

        result = result % 3; // the remainder of (4 % 3)
        System.out.println("4 % 3 ="+result);

        //result = result +1
        result++; //1+1=2
        System.out.println("1+1="+result);

        result--; //2-1=1
        System.out.println("2-1="+result);

        //result =result+2
        result += 2; //1+2=3
        System.out.println("1+2"+result);

        //result = result *10
        result *=10;
        System.out.println("3*10="+result);

        //result = result/3
        result/=3;
        System.out.println("30/3="+result);

        //result = result - 2
        result -=2;
        System.out.println("10-2="+result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of alien");
        }

        int topSocer = 80;
        if (topSocer != 100){
            System.out.println("You got the high score!");
        }
        if (topSocer == 100){
            System.out.println("You got the high score!");
        }
        if (topSocer > 100){
            System.out.println("You got the high score!");
        }
        if (topSocer <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore =95;
        if((topSocer > secondTopScore) && (topSocer <100)){
            System.out.println("Grater thane second top score and less than 100");
        }

        if ((topSocer > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

//        int newValue = 50;
//        if(newValue = 50){
//            System.out.println("this is an error");
//        }
        boolean isCar = true;
        boolean wasCar = isCar ? true :false;

        if(wasCar){
            System.out.println("wasCar is true");
        }
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    }
}
