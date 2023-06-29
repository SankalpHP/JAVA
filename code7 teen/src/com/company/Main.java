package com.company;

public class Main {

    public static void main(String[] args) {

        hasTeen(23,15,42);
        isteen(13);

    }

    public static boolean hasTeen(int range1, int range2, int range3) {
        if (range1 >= 13 && range1 <= 19 || range2 >= 13 && range2 <= 19 || range3 >= 13 && range3 <= 19) {
            System.out.println(" in range 13-19 ");
            return true;
        }
        System.out.println(" not in range 13-19 ");
        return false;

    }

    public static boolean isteen(int teen) {

        if (teen >= 13 && teen <= 19) {
            System.out.println(" in range 13-19 ");
            return true;
        }
        System.out.println("not in range 13-19 ");
        return false;
    }
}
