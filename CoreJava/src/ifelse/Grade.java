package ifelse;

import java.util.Scanner;

public class Grade {
	  
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Value");
		 int m = sc.nextInt();
		 
		 if(m>90) {
				System.out.println("A");
			}else if(m>=80 && m<90) {
				System.out.println("B");
			}else{
				System.out.println("Fail");
			}
	}

}
