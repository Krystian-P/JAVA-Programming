package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int countUp = 0;
	    for(int i=1; i <= 1000; i++){
            if ((i % 3 ==0) && (i % 5 == 0)){
                countUp++;
                sum = sum +i;
                System.out.println("liczba podzielna przez 3 i 5 to " + i);
            }
            if (countUp == 5){
                break;
            }
        }
        System.out.println("suma liczb " + sum);
    }
}
