package Arrays;

public class MaxValue {

    public static void main(String[] args) {

        int[] arr = {1,3,2,9,18};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3));
    }

    //Find max number in array
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //Find Max No in the Range
    public static int maxrange(int[] arr , int start , int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
