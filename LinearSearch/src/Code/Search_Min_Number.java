package Code;

public class Search_Min_Number {

    public static void main(String[] args) {
        int[] nums = {18,12,7,3,14,28};
        System.out.println(min(nums));
    }
    // assume arr.length != 0
    //return the minimum value in the array

    static int min(int[] arr ){
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < ans){
                ans = arr[index];

            }

        }
        return ans;
    }
}
