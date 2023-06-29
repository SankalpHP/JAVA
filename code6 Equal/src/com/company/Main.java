package com.company;

public class Main {

    public static void main(String[] args) {

         hasEqualSum(1,-1,0);
    }

         public static boolean hasEqualSum(int one,int two,int three ){
             if (one + two == three){
                 System.out.println(" equal = " + three);
                 return true;
             }
             System.out.println( "false = " + three);
             return false;
         }
}
