package avg;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[]  data = new int [5];
		Scanner obj = new Scanner(System.in);
		 int sum = 0,avg = 0;
		 
		 for(int i = 0 ; i < data.length;i++) {
			 System.out.println("enter a value ");
			 data[i]=obj.nextInt();
			 
		 }
		 for(int d : data) {
			 
			 sum+=d;
			 avg = sum /data.length;
			 
		 }
		 
		 System.out.println("sum of all value = "+ sum);
		 System.out.println("avg = "+avg);

	}

}
