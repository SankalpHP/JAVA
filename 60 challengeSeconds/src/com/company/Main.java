package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";

        }

        long hours = minutes / 60;
        long remainingminutes = minutes % 60;

        return hours + "h " + remainingminutes + "m " + seconds + "s";
    }

    private static String getDurationString(long second) {

        if (second < 0) {
            return "Invalid value";

        }
        long minute = second / 60;
        long remainingminute = second % 60;
        return getDurationString(minute, remainingminute);

    }
}
