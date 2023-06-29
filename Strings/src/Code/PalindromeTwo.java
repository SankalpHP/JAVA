package Code;

public class PalindromeTwo {

    public static void main(String[] args) {
        String str1 = "SANKALP";
        StringBuilder builder1 = new StringBuilder(str1);
        builder1.reverse();
        String data = builder1.toString();

        if (data.equals(str1)) {
            System.out.println("IsPalindrome");
        }else {
            System.out.println("Not IsPalindrome");
        }

    }

}
