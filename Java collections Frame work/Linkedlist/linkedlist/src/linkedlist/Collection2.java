package linkedlist;

import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> INT = new LinkedList<String>();
		
		INT.add("sam");
		INT.add("maxi");
		INT.add("vicky");
		INT.add("ricky");
		
		System.out.println(INT.contains("sam"));
		System.out.println(INT.clone());
		System.out.println(INT.get(3));
		System.out.println(INT.hashCode());
		System.out.println(INT.containsAll(INT));
		

	}

}
