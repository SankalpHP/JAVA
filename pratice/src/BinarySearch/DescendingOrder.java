package BinarySearch;

public class DescendingOrder {

    public static void main(String[] args) {
        int[] arr = {99,88,77,66,55,44,33,22,11};
        int Target = 11;
         int ans = binarySearch(arr,Target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
