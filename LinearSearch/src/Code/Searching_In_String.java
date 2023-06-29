package Code;

import java.util.Arrays;

public class Searching_In_String {

    public static void main(String[] args) {
       String name = "Sankalp";
       char target = 'a';
        boolean ans = search(name,target);
        System.out.println(ans);

        boolean ans2 = search2(name,target);
        System.out.println(ans2);

        System.out.println(Arrays.toString(name.toCharArray()));
        //toCharArray() converts string into any Char of Arrays
        //name.toCharArray()) converting name(Sanklap) into any char of Arrays

    }

    static boolean search(String str , char target){
        if(str.length() == 0){
            return  false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str , char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) { //str.toCharArray()) converting str(Sanklap) into any char of Arrays
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    }

