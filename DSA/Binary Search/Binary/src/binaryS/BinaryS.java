package binaryS;

import java.util.Scanner;

public class BinaryS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration 
		int data[] = new int[] {24,26,28,39,44,45,48,57,59,61,67,68,88,89,92,93,99};
		int input ;
		int high , low ,mid;
		boolean isfound = false;
		
		//input
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a element");
		input = Integer.parseInt(obj.nextLine());
		
		//initialization
		low = 0;
		high = data.length;
		mid = low + high / 2;
		
		//logic
		
		while(true) {
			if(input == data[mid]) {
				System.out.println("element is found " +mid);
			isfound = true;
			break;
			}
			else if(input < data[mid]){
				
				high = mid;
				
			}else {
				low = mid;
			
			}
			mid = (low + high) /2;
		}
		
			
		}
		
	}


