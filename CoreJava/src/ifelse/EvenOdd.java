package ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int num = sc.nextInt();
		
		if(num >= 0) {
			if(num%2 == 0) {
				System.out.println("Number is even " + num);
			}else {
				System.out.println("Number is Odd " + num);
			}
		}else {
			System.out.println("Number is 0 or Smaller than 0 " + num);
		}
	} 
	
}
