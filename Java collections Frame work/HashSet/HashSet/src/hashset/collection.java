package hashset;

import java.util.HashSet;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		HashSet<Integer> lin = new HashSet<Integer>();
		//HashSet avoid duplication of data
		//also not print it in a Order
		
		lin.add(20);
		lin.add(40);
		lin.add(50);
		lin.add(60);
		
		lin.add(40);
		lin.add(20);
		lin.add(60);
		lin.add(50);
		
		System.out.println(lin.size());
		
        for(int d:lin)
        	System.out.println(d);
	}

}
