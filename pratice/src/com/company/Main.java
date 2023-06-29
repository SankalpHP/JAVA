package com.company;

public class Main {

    public static void main(String[] args) {

        int firstnumber=20;
        int secondnumber=60;
        int total=(secondnumber-firstnumber)*100;
        System.out.println("total="+total);
        int division=total%20;
        System.out.println("remainder="+division);
        boolean remaninder=(division==0)?true:false;
        System.out.println("remiander="+remaninder);
        if(!remaninder){
            System.out.println("got some remainder");
        }

    }
}
