package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimesionalArrayList {

    public static void main(String[] args) {

          Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation

        // we initialed this Our ArrayList to Size 6
        for (int i = 0; i < 6; i++) {
            list.add(new ArrayList<>());
        }

        //input or Adding  6 element because we initialed our list to size 6 only

        for (int i = 0; i < 6; i++) {
            list.get(i).add(in.nextInt());//get(i) = get the list at index no 0 because initially i=0 in loop
        }

        //output
        System.out.println(list);
    }
}
