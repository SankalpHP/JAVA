package Code;

import java.util.Scanner;

public class PalindromeONE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = in.next();
       System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
       return true;
    }
}
