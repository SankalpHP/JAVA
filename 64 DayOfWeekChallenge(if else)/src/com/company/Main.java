package com.company;

public class Main {

    public static void main(String[] args) {
        DayOfWeekChallenge(-1);

        DayOfWeekChallenge(0);
        DayOfWeekChallenge(1);
        DayOfWeekChallenge(2);
        DayOfWeekChallenge(3);
        DayOfWeekChallenge(4);
        DayOfWeekChallenge(5);
        DayOfWeekChallenge(6);

        DayOfWeekChallenge(7);

    }

    public static void DayOfWeekChallenge(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Thuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");

        }

    }

}
