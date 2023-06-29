package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        // max value similar for short byte double

        int maxvalue = Integer. MAX_VALUE;
        System.out.println("maxvalue=" + maxvalue);
        int minvalue = Integer. MIN_VALUE;
        System.out.println("minvalue=" + minvalue);
        int maxbustvalue = maxvalue + 1;
        System.out.println("overflow=" + maxbustvalue);
        int minbustvalue = maxvalue + 1;
        System.out.println("underflow=" + minbustvalue);

        // string concept

        String student = "marsh is good boy";
        System.out.println("student=" + student);
        String marks = student +", he scores good marks in maths";
        System.out.println("student=" + marks);
        String number = marks + '\u0094';
        System.out.println("final sheet = " + number);

         // method concept

        divisionmultipication(100 , 200 ,5);

        divisionmultipication(400 , 600 , 7);

    }

    public static void divisionmultipication (int a , int b ,int c ){
        int d = (a * b) % c ;
        System.out.println("answer = " + d);
        boolean condtion = (d==0)? true : false;//terenery op
            System.out.println("true or false = " + condtion);
        if (!condtion){//if else cond
            System.out.println("condition get false = " + condtion );

        }
        else{
            System.out.println("correct = " + condtion);
        }

    }

}