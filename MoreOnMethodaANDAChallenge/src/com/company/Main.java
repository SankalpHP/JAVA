package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

       int highscore =  calculator( true , 800 , 5 , 100);
        System.out.println("final score = "+ highscore);


         gameover = true;
         score = 10000;
         levelcompleted = 8;
          bonus = 200;
          highscore = calculator (true , 10000 , 8 , 200);
        System.out.println("final score = " + highscore);
    }

    public static int calculator(boolean gameover, int score, int levelcompleted, int bonus) {
        if (gameover) {
            int total = score + (levelcompleted * bonus);
            total += 2000;
            return total;
        }
           return -1;
    }

}

