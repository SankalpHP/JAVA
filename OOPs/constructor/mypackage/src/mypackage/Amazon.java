package mypackage;

import java.util.Scanner;

public class Amazon {
	private String name;
	private int id;
	private int price;
	private static String seller = "Cloud retailer";
	
	
	public void readData(){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a Product name = ");
		name = obj.nextLine();
		System.out.println("enter a Product id = ");
		id = obj.nextInt();
		System.out.println("enter a product price = ");
		price = obj.nextInt();	
		obj.close();
	}
	
	
	  public void writeData() {
		  System.out.println("name = " + name);
		  System.out.println("id = " + id);
		  System.out.println("price = " + price);
	  }
	  
	  public static void printseller() {
		  System.out.println("seller details = " + seller);
	  }
}

