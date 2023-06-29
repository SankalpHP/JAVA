package treeset;

import java.util.TreeSet;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(35);
		ts.add(30);
		ts.add(80);
		ts.add(60);
		
		ts.add(60);
		ts.add(30);
		ts.add(80);
		ts.add(35);
		
		System.out.println(ts.size());
		
		System.out.println(ts.clone());
		System.out.println(ts.hashCode());
		
		System.out.println("=======================");
		
		for(int d : ts)
			System.out.println(d);
	}

}
