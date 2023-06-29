package Code;

import java.util.Arrays;

public class Search_Max_In_2D_Array {

    public static void main(String[] args) {

        int[][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12},
        };
        int result = max(nums);
        System.out.println(result);
    }
    //previous approach that Assume array is empty you can also use that approach
    static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > ans){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
