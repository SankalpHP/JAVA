package switchcase;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter empID");
		    int empID = in.nextInt();
		    String department = in.next();
		    
		    switch (empID) {
		        
		    case 1-> System.out.println("Sankalp Selokar");
		    case 2-> System.out.println("Rahul Rana");
		    case 3-> {
		    	System.out.println("Emp Number 3");
		    	switch(department) {
		    	case "IT" -> System.out.println("IT Department");
		    	case "Management" -> System.out.println("Management Department");
		    	default -> System.out.println("No department entered");
		    	}
		    }
		    default -> System.out.println("Enter correct EmpID");
		    }
	}

}
