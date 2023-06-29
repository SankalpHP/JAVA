package programs;

import java.util.Scanner;

public class LargersNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Values");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
//
//		int max = a;
//
//		if (b > max) {
//			max = b;
//		} else if (c > max) {
//			max = c;
//		}
//		System.out.println(max);
		
//		if(a > b) {
//			System.out.println("A is greater than b= " + a);
//		}else if(b > a) {
//			System.out.println("B is greater than a= " + b);
//		}else if(c > a && c > b) {
//			System.out.println("C is greater than A & B= " + c);
//		}
		
		int max = Math.max(c, Math.max(a, b));
		System.out.println(max);

	}
}
