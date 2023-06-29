package programs;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		System.out.println("enter a Char");
		
		char ch = in.next().trim().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("LowerCase");
		}else {
			System.out.println("UpperCase");
		}
		
	}

}
