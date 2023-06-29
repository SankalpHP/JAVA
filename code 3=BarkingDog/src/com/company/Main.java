package com.company;

public class Main {

    public static void main(String[] args) {

           shouldWakeUp(true, 1);
    }
      public static boolean shouldWakeUp(boolean max , int hoursOfDay){

        if(max == true && hoursOfDay < 8){
            System.out.println("true");
            return true ;
        }

        else {
            System.out.println("dog is not barking");
        }
         return false;
      }

}
