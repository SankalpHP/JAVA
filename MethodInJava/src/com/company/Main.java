package com.company;

public class Main {

    public static void main(String[] args) {
//        boolean gameover = true;
//        int score = 800;
//        int levelcompleted = 5;
//        int bonus = 100;

        calculator( true , 800 , 5 , 100);

//         gameover = true;
//         score = 10000;
//         levelcompleted = 8;
//         bonus = 200;

        calculator (true , 10000 , 8 , 200);
    }

    public static int calculator(boolean gameover, int score, int levelcompleted, int bonus) {
        if (gameover) {
            int total = score + (levelcompleted * bonus);
            total += 2000;
            System.out.println("total=" + total);
            return total;
        }

        return -1;
    }

}
