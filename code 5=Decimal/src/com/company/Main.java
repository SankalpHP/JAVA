package com.company;

public class Main {

    public static void main(String[] args) {

       areEqualByThreeDecimalPlaces(-3.123,3.123);
    }
       public static boolean areEqualByThreeDecimalPlaces(double number1,double number2){
        int a = (int) number1 * 1000;
        int b = (int )number1 * 1000;

        if (number1 == number2){
            System.out.println("True = " + number1 + " = " + number2);
            return true;
        }
           System.out.println("false = " + number1 + " = " + number2);
           return false;
       }
}
