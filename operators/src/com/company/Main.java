package com.company;

public class Main {


    public static void main(String[] args) {
        int myint = 1 + 2;
        System.out.println("1+2=" + myint);

        int previoussresult = myint;//previous=3
        System.out.println("previousresult=" + previoussresult);

        previoussresult = myint * 10;//3*10=30
        System.out.println("3*10=" + previoussresult);

        previoussresult = previoussresult / 5;//30/5=6
        System.out.println("30/5=" + previoussresult);

        previoussresult = previoussresult % 5;//6%5=1
        System.out.println("6%5=" + previoussresult);

        //Abbrevating operator(shortcuts)
        previoussresult++;//1+1=2
        System.out.println("1+1=" + previoussresult);

        previoussresult--;//2-1=1
        System.out.println("2-1=" + previoussresult);

        previoussresult += 2;//1+2=3
        System.out.println("1+2=" + previoussresult);

        previoussresult *= 10;//3*10=30
        System.out.println("3*10=" + previoussresult);

        previoussresult /= 3;//30/3=10
        System.out.println("30/3=" + previoussresult);

        previoussresult %= 3;//10%3
        System.out.println("10%3=" + previoussresult);

        boolean isaliens = false;
        if (isaliens == false) {
            System.out.println("aliens are coming!");
            System.out.println("and i am scared");
        }
        int topscore=80;
        if (topscore==80){
            System.out.println("student gets pass!");
        }
        int secondscore = 60;
        if (topscore > secondscore && topscore < 100)
        {
            System.out.println("student got above 60%");
        }
        int thirdscore=30;
        if(topscore>thirdscore&&secondscore<topscore){
            System.out.println("student got very less marks in marathi");
        }
          if((topscore>90)||(secondscore<=90)){
              System.out.println("Either or both of the conditions are true");
          }

          int newvalue=50;
          if (newvalue==50){
              System.out.println("This is an true");
          }
          boolean iscar=false;
          if (!iscar){
              System.out.println("this not suppose to happens");
          }
          iscar=true;
          boolean wascar=true;
          if (wascar=(iscar)?true:false){
              System.out.println("TRUE");
          }
          wascar=false;
          iscar=true;
          if(iscar=(wascar)?true:false){
              System.out.println("FALSE");
          }

    }
}