package ArrayAndLinerSearch;

import java.util.Arrays;

public class Search_In_2D_Array {

    public static void main(String[] args) {
        int[][] nums = {
                {22,45,67,88},
                {76,98},
                {23,56,89,39},
        };
        int target = 98;
         int[] ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
