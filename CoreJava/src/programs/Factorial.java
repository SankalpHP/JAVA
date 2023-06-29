package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Value");
		 int n = in.nextInt();
		 int factorial = 1;
		 
		 for(int count = 1; count <= n ; count++) {
			 factorial *= count;
		 }
		 System.out.println(factorial);
	}

}
