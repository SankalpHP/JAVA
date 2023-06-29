package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a String");
		 String s = in.nextLine();
		 
		   StringBuilder sb = new StringBuilder(s);
		   sb.reverse();
		   System.out.println(sb);
	}

}
