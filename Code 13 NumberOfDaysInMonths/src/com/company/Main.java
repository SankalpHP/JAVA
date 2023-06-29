package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isLeapYear(2018);
        getDaysInMonth(2,2020);
    }
     public static boolean isLeapYear(int year) {

         if (year >= 0 && year <= 9999) {
             if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0){
                 return true;

             }else {
                 System.out.println(year + " is not a leap year");
                 return false;
             }
         } else {
             return false;
         }
     }
       public static int getDaysInMonth(int month , int year) {
           if (month < 1 || month > 12) {
               return -1;

           } else if (year < 1 || year > 9999) {
               return -1;
           } else {
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
                       if (isLeapYear(year)) {
                           System.out.println(year + " is a leap year");
                           return 29;
                       } else {
                           return 28;
                       }

                   case 4:
                   case 6:
                   case 9:
                   case 11:
                       System.out.println(month + "30 days");
                       return 30;
                   default:
                       return -1;
               }


           }
    }
}

