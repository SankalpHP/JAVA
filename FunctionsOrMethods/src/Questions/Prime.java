package Questions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();
        prime(num);
    }

    static void prime(int number){
              int n = 2;

              while (n<number){

                  if(number % n == 0){
                      System.out.println( number + " The number is not prime number");
                      break;
                  }
                  n = n + 1;
                  n++;



              }
        System.out.println( number  + " number is prime number");


    }
}
