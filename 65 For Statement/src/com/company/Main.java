package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // write your code her
        CalculateInterset(10000);

    }

    public static void CalculateInterset(int amount) {
        for (int i = 2; i <= 8; i++) {
            int interest = (amount * i) / 100;
            System.out.println("Intreset = " + interest);
        }
        System.out.println("*****************");

        for (int j = 8; j >= 2; j--) {
            int interest1 = (amount * j) / 100;
            System.out.println("Intreset = " + interest1);

        }
        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}





