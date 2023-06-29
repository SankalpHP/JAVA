package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

// when we don't know what size of array we want that time we use ArrayList
        ArrayList<Integer> list = new ArrayList<>();
          Scanner in = new Scanner(System.in);

//        list.add(99);
//        list.add(122);
//        list.add(134);
//        list.add(1344);
//        list.add(24344);
//        list.add(5667);
//
//        System.out.println(list.get(2));
//        System.out.println(list.clone());
//        System.out.println(list);
//        System.out.println(list.remove(4));
//        System.out.println(list);

        //input to only 5 numbers in arraylist for more input just change the no 5 to any no depending upon our input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

    }
}
