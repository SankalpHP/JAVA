package programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num = in.nextInt();
		 int ans = 0;
		 
		 while(num > 0){
			 int rem = num % 10;
			 num = num / 10;// num/= 10
			 
			 ans = ans * 10 + rem;
		 }
		 System.out.println(ans);
	}

}