package queue;

import java.util.PriorityQueue;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.add("prince");
		p.add("Queen");
		p.add("King");
		p.add("Villa");
		
		
		System.out.println(p.size());
		
		System.out.println(p.poll());//King because size of king is small
		
		System.out.println(p.size());
		
	}

}
