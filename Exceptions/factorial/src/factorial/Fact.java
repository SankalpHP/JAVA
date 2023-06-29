package factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fact {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1 ;
		int num ;
		Scanner fac = new Scanner (System.in);
		
		try {
		System.out.println("enter a value ");
		num = Integer.parseInt(fac.nextLine());
		
		
		for(int a = 1 ; a <= num ;++a) {
			
			fact*=a;
		}
		
		System.out.println("Factorial = " +fact);
		fac.nextLine();
		
		}
		catch(NumberFormatException EX) {
			System.out.println("please enter only numerical value");
			fac.nextLine();
		}
		}

}
