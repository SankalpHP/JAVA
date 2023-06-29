package ArrayAndLinerSearch;

import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] num = {243,476,586,9879,7484};
        System.out.println("Enter the starting index");
        int start = in.nextInt();
        System.out.println("Enter the ending index");
        int end = in.nextInt();
        search(num,start,end);
    }

    static void search(int[] arr,int start,int end){
        int Max = 0;
        for (int index = start; index <= end; index++) {
            if (Max < arr[index]) {
                Max = arr[index];
            }
        }
        System.out.println("Max value the range = " + Max);
    }
}
