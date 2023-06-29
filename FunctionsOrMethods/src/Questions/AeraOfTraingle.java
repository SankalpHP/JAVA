package Questions;

import java.util.Scanner;

public class AeraOfTraingle {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base and Height");
        int base = in.nextInt();
        int height = in.nextInt();
          int result =  aera(base,height);
        System.out.println(result);
    }

    public static int aera(int b , int h){

        return (b * h)/2;



    }
}
