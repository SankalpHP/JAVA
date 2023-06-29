package printbyforloop;


import java.util.*;

public class byforloop {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a [] = new int [5];
	  
	    
		for(int b = 0 ; b< a.length ; b++) {
			
			
		    Scanner no = new Scanner(System.in);
			System.out.println("enter a value");
			a[b]=no.nextInt();
		
			}
		
		System.out.println("User Input = "+Arrays.toString(a));
		
		}
		
}


