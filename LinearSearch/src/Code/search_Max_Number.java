package Code;

public class search_Max_Number {

    public static void main(String[] args) {
      int[] nums = {18,12,7,3,34,14,28};
        System.out.println(max(nums));
    }
    // assume arr.length != 0
    //return the maximum value in the array
    static int max(int[] arr){
        int ans = arr[0];
        for (int index = 1; index < arr.length ; index++) {
            if (arr[index] > ans){
                ans = arr[index];
            }
        }
        return ans;
    }
}


