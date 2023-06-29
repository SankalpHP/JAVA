package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int switchvalve = 5;
        switch (switchvalve) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            case 4:
                System.out.println("value is 4");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("value 5 or 6 or 7");
                System.out.println("value is = " + switchvalve);
                break;
            default:
                System.out.println("No match");
                break;
        }

        char charvalue = 'C';
        switch (charvalue) {
            case 'A':
                System.out.println("A was found ");
                break;
            case 'B':
                System.out.println("B was found ");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charvalue + " was found");
                break;

            default:
                System.out.println("Saying not found");
                break;
        }

        // IN JAVA 7jdk ,WE CAN ALSO USE SWITCH STATEMENT WITH STRING

        String months = "JAN";
        switch (months.toLowerCase()) {
            case "jan":
                System.out.println("jan");
                break;
            case "aug":
                System.out.println("AUG");
                break;
            default:
                System.out.println("not found");
                break;

        }


        months = "aug";
        switch (months.toUpperCase()) {
            case "JAN":
                System.out.println("JAN");
                break;
            case "AUG":
                System.out.println("AUG");
                break;
            default:
                System.out.println("not found");
                break;

        }
    }
}
