package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelcompleted = 100;
        int bonus = 5;

        if(score > 5000 && score >= 800){
            System.out.println("score is Smaller than 5000 and smaller than == 800");
        }
        else if(score >= 800){
            System.out.println("got here");
        }

        if(gameOver){
            int totalscore = score + ( levelcompleted ) * bonus ;
            System.out.println("totalscore=" + totalscore);
       }
        boolean newgame = true;
        int secondscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;

        if (secondscore < 1000 && secondscore > 500) {
            System.out.println("correct value");
        } else if (secondscore > 500) {
            System.out.println("greater than 500!");
        }
        if (newgame) {

            int secondtotal;
            secondtotal = secondscore + (newlevelcompleted * newbonus);
            System.out.println("secondtotal=" + secondtotal);


        }
    }
}