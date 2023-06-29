package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        double centrimeter = CalcFeetAndInchesToCentrimeter(6, 0);
        if (centrimeter < 0.0) {
            System.out.println("Invalid parameter");
        }
        CalcFeetAndInchesToCentrimeter(100);
    }

    public static double CalcFeetAndInchesToCentrimeter(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;

        }
        double centrimeter = (feet * 12) * 2.54;
        centrimeter += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centrimeter + "cm");
        return centrimeter;
    }

    public static double CalcFeetAndInchesToCentrimeter(double inches) {
        if (inches < 0) {
            return -1;

        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal " + feet + " feet and " + remainingInches);
        return CalcFeetAndInchesToCentrimeter(feet, remainingInches);
    }
}

