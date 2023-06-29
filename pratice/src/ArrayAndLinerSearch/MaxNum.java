package ArrayAndLinerSearch;

public class MaxNum {

    public static void main(String[] args) {
        int[] num = {243,476,586,9879,7484,364754849};
        op(num);
    }

    static void op(int[] arr){
        int Max = 0;
        for (int i = 0; i < arr.length; i++) {
           if (Max < arr[i]){
               Max = arr[i];
           }
        }
        System.out.println("Max num in arr " + Max);


    }
}
