package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));


    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingminutes = minutes % 60;

        String hourString = hours + "h";
        if (seconds < 10) {
            hourString = "0" + hourString;
        }
        String minuteString = minutes + "m";
        if (minutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return hourString + " " + minuteString + " " + secondsString;
    }

    private static String getDurationString(long second) {

        if (second < 0) {
            return INVALID_VALUE_MESSAGE;

        }
        long minute = second / 60;
        long remainingminute = second % 60;
        return getDurationString(minute, remainingminute);

    }
}


