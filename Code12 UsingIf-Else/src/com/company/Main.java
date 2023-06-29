package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printNumberInWord(-1);

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);

        printNumberInWord(10);

    }

    public static void printNumberInWord(int day) {
        if (day == 0) {
            System.out.println("zero");
        } else if (day == 1) {
            System.out.println("One");
        } else if (day == 2) {
            System.out.println("Two");
        } else if (day == 3) {
            System.out.println("Three");
        } else if (day == 4) {
            System.out.println("Four");
        } else if (day == 5) {
            System.out.println("Five");
        } else if (day == 6) {
            System.out.println("Six");
        } else if (day == 7) {
            System.out.println("Seven");
        } else if (day == 8) {
            System.out.println("Eight");
        } else if (day == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Others");
        }

    }
}
