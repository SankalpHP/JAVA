package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int num = 1 ; num <= 1000 ; num++  ){
            if((num % 3 == 0) && (num % 5 == 0)){
                count++;
                sum += num;
                System.out.println("Found number = " + num);

            }
              if(count == 5){
                  break;
              }
            }
        System.out.println("sum = " + sum);

        }

    }

