package BinarySearch;

public class Floor_Of_Number {

    public static void main(String[] args) {
        int[] arr = {200,300,400,500,600};
        int target = 550;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        if(target < arr[arr.length - 1]){
//            return  - 1;
//        }

        while (start <= end){

            int mid = start + (end - start)/2;
         //if condition is according to ascending order array
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
       // return end;
        return arr[end % arr.length];
    }
}
