package com.company;

public class Main {

    public static void main(String[] args) {


        int highscorepostion =  CalculateHighScorePosition(1500);
        displayHighScorePosition("tim" , + highscorepostion);

        highscorepostion = CalculateHighScorePosition(900);
        displayHighScorePosition("mark" , + highscorepostion );

        highscorepostion = CalculateHighScorePosition(400);
        displayHighScorePosition("mercy" , + highscorepostion);

        highscorepostion = CalculateHighScorePosition(50);
        displayHighScorePosition("bob" , + highscorepostion);

        highscorepostion = CalculateHighScorePosition(1000);
        displayHighScorePosition("jason" , + highscorepostion);

        highscorepostion = CalculateHighScorePosition(500);
        displayHighScorePosition("twin" , + highscorepostion);

        highscorepostion = CalculateHighScorePosition(100);
        displayHighScorePosition("ross" , + highscorepostion);


    }

    public static void displayHighScorePosition(String playername, int highscoreposition) {

        System.out.println ( playername +  " , managed to get into position" + highscoreposition  + " ,on highscore table");


    }

    public static int CalculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return  1;
//        }
//
//        else if (score >= 500 ) {
//             return 2;
//        }
//         else if (score >= 100 ){
//             return 3;
//         }
//          else {
//              return 4;
//        }

        int position = 4;

         if(score >= 1000){
             position = 1 ;
         }
           else if (score >= 500){
               position = 2 ;
         }
           else if  (score >= 100) {
               position = 3 ;
         }
            return position ;

    }
}