package switchcase;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int day = sc.nextInt();
        // new enhanced Switch case Syntax
		switch (day) {
		case 1 -> System.out.println("Its Sun");
		case 2 -> System.out.println("Its Mon");
		case 3 -> System.out.println("Its Tues");
		case 4 -> System.out.println("Its Wed");
		case 5 -> System.out.println("Its thur");
		case 6 -> System.out.println("Its Fri");
		case 7 -> System.out.println("Its Sat");
		default -> System.out.println("Invalid Day");

		}

		switch (day) {
		case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
		case 6, 7 -> System.out.println("Weekend");
		}

	}
}
