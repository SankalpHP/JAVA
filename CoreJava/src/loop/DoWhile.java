package loop;

import java.util.Scanner;

public class DoWhile {
	
	private void op() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a Value");
	      int i = sc.nextInt();
	      do {
	    	  System.out.println("HELLO WORLD");
	    	  i++;
	      }while(i>5);
	}
        
	public static void main(String[] args) {
		
		DoWhile DW = new DoWhile();
		DW.op();
	}
	
}


