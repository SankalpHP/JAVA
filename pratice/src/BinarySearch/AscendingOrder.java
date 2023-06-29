package BinarySearch;

public class AscendingOrder {

    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66, 77, 88, 99};
        int target = 88;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr , int Target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (Target < arr[mid]) {
                end = mid - 1;
            }else if(Target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
