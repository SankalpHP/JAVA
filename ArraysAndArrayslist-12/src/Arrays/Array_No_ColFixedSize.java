package Arrays;

import java.util.Arrays;

public class Array_No_ColFixedSize {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},//row Having 4 cols
                {5,6},//row Having 2 cols
                {7,8,9},////row Having 3 cols
        };

        //arr[row].length = check a col of particular rows because size of col is not fix
        // Always use arr[row].length this only it's a good Practice

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row] [col] + "  ");
            }
        }
    }
}
