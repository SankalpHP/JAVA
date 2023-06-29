package Code;

import java.util.Arrays;

public class Search_In_2D_Array {

    public static void main(String[] args) {

        int[][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12},
        };
        int target = 56;
        int[] ans = linearSearch(nums,target);//format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }

  static int[] linearSearch(int[][] arr,int target){
      for (int row = 0; row < arr.length; row++) {
          for (int col = 0; col < arr[row].length; col++) {
              if (arr[row] [col] == target){
                  return new int[]{row,col};
              }
          }
      }
      return new int[]{-1,-1};
  }

}
