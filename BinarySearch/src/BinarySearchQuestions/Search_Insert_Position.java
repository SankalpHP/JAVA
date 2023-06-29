package BinarySearchQuestions;

import java.util.Arrays;

public class Search_Insert_Position {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(nums,target);
        System.out.println(ans);

    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;


        while (start <= end){
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                // ans found
                return mid;
            }

        }
        return start;
    }
}
