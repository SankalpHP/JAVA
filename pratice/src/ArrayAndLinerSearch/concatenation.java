package ArrayAndLinerSearch;

import java.util.Arrays;

public class concatenation {

    public static void main(String[] args) {
        int[] num = {243,476,586,9879,7484};

       int[] r =  getConcatenation(num);

        System.out.println(Arrays.toString(r));

    }

    static int[] getConcatenation(int[] nums) {

        // n contains length of array nums
        int n = nums.length;

        // length of array temp becomes twice of length of array nums i.e store at the n
        // 2 * n = 6
        int[] temp = new int[2 * n];

        //length of temp becomes twice of length of arr nums
        for (int i = 0; i < nums.length; i++) {
            // array temp gets all the value of array nums

            temp[i] = nums[i];
            //length of array temp becomes 6 and n gets all the value of array nums
            // so i = [1,2,1 + n ] = num[i];
            //so i = [1,2,1,1,2,1]

            temp[i + n] = nums[i];


        }
        return temp;
    }

}




