package BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
       // int[] nums = {22,33,44,55,66,77,88,99};

        int[] nums = {99,88,77,66,55,44,33,22};

        int target = 77;
         int ans = binarySearch(nums,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
