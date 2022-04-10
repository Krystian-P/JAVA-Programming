package com.company;

import java.time.Year;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if(year<1 || year >9999) return false;
        else {
            int oddYear4=year%4;
            int oddYear100=year%100;
            int oddYear400=year%400;
            if(oddYear4 == 0 && oddYear100 != 0 || oddYear400 == 0){
                return true;
            }else return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999) return -1;
        else {
            if (isLeapYear(year)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 29;
                    default:
                        return 30;
                }
            }else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 28;
                    default:
                        return 30;
                }
            }
        }
    }
}
