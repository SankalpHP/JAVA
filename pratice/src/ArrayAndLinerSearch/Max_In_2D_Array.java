package ArrayAndLinerSearch;

public class Max_In_2D_Array {

    public static void main(String[] args) {
        int[][] arr = {
                {25,50,75},
                {100,125,999},
                {150,175,200},
        };
         int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[][] arr){
        int Max = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > Max) {
                    Max = arr[row][col];
                }
            }
        }
        return Max;
    }
}
