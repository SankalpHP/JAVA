package product;

import java.util.Scanner;

public class Flipcart {
	
	private String Name;
	private int id;
	private int price;
	
	public static String Otherdetails = "cloud retailer";
	
	
	public void readData() {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a Name =");
		Name = obj.nextLine();
		System.out.println("enter a id =");
		id =  obj.nextInt();
		System.out.println("enter a price = ");
		price = obj.nextInt();
		obj.close();
		
		
	}
	
	
	public void PrintData() {
		System.out.println("Name = " + Name);
		System.out.println("id = " + id);
		System.out.println("price = " + price);
	}
	
	public static void printDetails() {
		System.out.println("seller = " + Otherdetails);
	}

}
