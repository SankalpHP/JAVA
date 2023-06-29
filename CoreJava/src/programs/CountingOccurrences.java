package programs;

import java.util.Scanner;

public class CountingOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
		int n = in.nextInt();
		System.out.println("Enter the Check Number");
		int check = in.nextInt();
		
		int count = 0;
		
		while(n>0) {
			int rem = n%10;
			if(rem == check) {
				count++;
			}
			n = n / 10 ;
		}
		System.out.println(count);
	}

}
