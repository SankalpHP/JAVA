package com.company;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
           if  (year %  4 == 0){
               if (year % 100 == 0 && year % 100 == 0){
                   System.out.println(" is a leap year = " + year);
                   return true;
               }
               return true;
           }
            System.out.println(" is not leap year = " + year);
            return false;
        }
        System.out.println("invalid range = " + year );
        return false;
        }

}
