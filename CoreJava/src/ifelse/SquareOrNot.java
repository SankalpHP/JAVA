package ifelse;

import java.util.Scanner;

public class SquareOrNot {
 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a value of l");
		 int l = sc.nextInt();
		 
		 System.out.println("Enter a value of b");
		 int b = sc.nextInt();
		 
		 if(l>0 && b>0) {
			  if(l == b) {
				  System.out.println("The fig is Square");
			  }else {
				  System.out.println("The fig is not Square");
			  } 
		 }else {
			System.out.println("Number is Invalid"); 
		 }
	 }
}
