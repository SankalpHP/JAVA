package programs;

import java.util.Scanner;

public class AreaOfFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner in  = new Scanner(System.in);
		Double A;
		System.out.println("Enter the Radius");
		int r = in.nextInt();
		  Double PI = 3.14159265358979323846;
		  
		  A = PI * r*r;
		  System.out.println("Aera of the Cricle = " + A);
	}

}
