package com.company;

public class Main {

    public static void main(String[] args) {

        int newscore = calulateScore("tim", 500);
        System.out.println("newscore = " + newscore);
           calulateScore(400);
           calulateScore();
    }

    public static int calulateScore(String playername, int score) {
        System.out.println("playername " + playername + " score " + score + " points ");
        return score * 1000;
    }

    public static int calulateScore(int score) {
        System.out.println("noplayername score = " + score);
        return 0;

    }

    public static boolean calulateScore() {
        System.out.printf("noplayername " + " noscore");
        return false;
    }

}
