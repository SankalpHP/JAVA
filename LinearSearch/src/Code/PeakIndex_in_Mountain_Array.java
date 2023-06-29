package Code;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex_in_Mountain_Array {

    public static void main(String[] args) {
         int[] arr = {3,4,5,1};
         int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int Max = arr[0];

        for(int index = 0 ; index < arr.length  ; index++){

            if(arr[index] > Max){
                Max = arr[index];
                //return index;
            }

        }
        return Max;
    }
}
