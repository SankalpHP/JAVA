package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        sumodd(1, 100);
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } 
        return true;
    }

    public static int sumodd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + 1;
                }

            }
            System.out.println("sum = " + sum);
            return sum;

        } else {
            return -1;
        }
    }
}


