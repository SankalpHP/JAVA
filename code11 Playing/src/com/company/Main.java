package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         isCatPlaying(true,10);
         isCatPlaying(false,36);
        isCatPlaying(false,35);
    }
       public static boolean isCatPlaying(boolean summer,int temperature){
        if( temperature >= 25 && temperature <= 35){
            System.out.println("true");
            return true;

        }else if ((summer) && (temperature <= 25) && (temperature >= 45)){
            System.out.println("true");
            return true;
           }else
           System.out.println("false");
        return false;
       }
}
