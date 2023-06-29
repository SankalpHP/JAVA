package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
      // This is the Array of primitives 
        int[] arr = new int[5];

        // hard coded inputs

//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

       // System.out.println(arr[4]);

        //giving inputs by loop

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the values ");
            arr[i]= in.nextInt();
        }

        //Ways To Print a Array

        //First Ways by loops

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //Second Ways to print a Arrays By for each loop

//        for ( int j:arr) {
//            System.out.print(j + " ");
//        }

        //THIRD AND THE BEST WAY TO PRINT A ARRAY

        System.out.println(Arrays.toString(arr));

    }
}
