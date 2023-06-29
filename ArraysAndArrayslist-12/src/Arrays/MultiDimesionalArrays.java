package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesionalArrays {

    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];// [3] = No of Rows , [3] = No of cols

        // hard cored multi dimesional Arrays
//        int arr[] [] = {
//                {1,2,3},
//                {4,5},
//                {6,7,8},
//
//        };

        //Input

        //arr[row].length = check a col of particular rows because size of col is not fix
        // Always use arr[row].length this only it's a good Practice
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr [row] [col] = in.nextInt();
            }
        }

        //Output

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();

        //Output By for each loop
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
