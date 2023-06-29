package ArrayAndLinerSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multidimensional {

    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3,4},
                {5,6},
                {7,8,9},
        };
        mulArr(nums);
    }

    static void mulArr(int[][] arr){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
