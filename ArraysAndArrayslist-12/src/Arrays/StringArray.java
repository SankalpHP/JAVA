package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }

        System.out.println(Arrays.toString(str));

        //modify

        str[1] = "Sankalp Selokar";
        System.out.println(Arrays.toString(str));
    }
}
