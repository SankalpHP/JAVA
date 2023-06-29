package com.company;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(1051200);

    }
        public static void printYearsAndDays(long minute){

            if(minute < 0){
                System.out.println(" Invalid Value");

            }
               else {
                   long MinuteIntoHours = minute / 60;
                   long HoursIntoDays = MinuteIntoHours / 24;
                   long DaysIntoYear = HoursIntoDays / 365;
                   long remainingdays = HoursIntoDays % 365;
                System.out.println( minute + "min = " + DaysIntoYear + "y"+ " and " + remainingdays + "d");
            }

        }
}
