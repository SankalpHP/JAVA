package com.company;

public class Main {

    public static void main(String[] args) {
        byte mybyteValue = 12;
        short myshortValue = 10;
        int myvalue = 40 ;
        long mylongValue = 55000L + 10L * (mybyteValue + myshortValue + myvalue);
        System.out.println(mylongValue);

    }
}
