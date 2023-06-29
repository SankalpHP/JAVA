package Code;

import java.util.Arrays;

public class ConcatenationOFArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] r = getConcatenation(nums);
        System.out.println(Arrays.toString(r));
    }

    static int[] getConcatenation(int[] nums) {

        // n contains length of array nums
        int n = nums.length;

        // length of array temp becomes twice of length of array nums i.e store at the n
        // 2 * n = 6(from 0 to 5)
        int[] temp = new int[2 * n];

        //length of temp becomes twice of length of arr nums
        for (int i = 0; i < nums.length; i++) {
            // array temp gets all the value of array nums

            temp[i] = nums[i];
            //length of array temp becomes 5 and n gets all the value of array nums
            // so i = [1,2,1 + n ] = num[i];
            //so i = [1,2,1,1,2,1]

            temp[i + n] = nums[i];


        }
        return temp;
    }

}
