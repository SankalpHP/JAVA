package ArrayAndLinerSearch;

public class array {

    public static void main(String[] args) {
        int[] num = {243,476,586,9879,7484};
        int target = 476;
        op(num,target);

    }

    static void op(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
           if (target == arr[i]) {
               System.out.println("Index of Number = " + target + " is = " + i);
           }
        }

    }
}
