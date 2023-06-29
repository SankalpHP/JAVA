package loop;

import java.util.Scanner;

public class While {
      
	private void op() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		
		while(a < 5){
			System.out.println("HELLO WORLD " + a);
			a++;
		}
	}
	
	public static void main(String[] args) {
		While Wh  = new While();
		Wh.op();
	}
}
