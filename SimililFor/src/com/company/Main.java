package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a [] = new int [5];

        int max = Integer.MIN_VALUE;

        for(int b = 0 ; b< a.length ; b++) {


            Scanner no = new Scanner(System.in);
            System.out.println("enter a value");
            a[b]=no.nextInt();


            if(a[b] > max) {
                max = a[b];
            }
        }
        System.out.println("biggest number "+ max);
        System.out.println("User Input = "+Arrays.toString(a));

    }
}



