package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if( a > b || c > a ){
            System.out.println("a is smaller than b ");
        }
          else if ( c < a){
            System.out.println("c is greater than a");
        }
          else if ( b > c ){
            System.out.println("b is greater than c");
        }
    }
}