package queue;

import java.util.PriorityQueue;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		PriorityQueue<Integer> que = new PriorityQueue<Integer>() ;
		 
		que.add(111);
		que.add(122);
		que.add(130);
		que.add(1543);
		que.add(15);
		
		
	    System.out.println(que.size());
		System.out.println(que.poll());//15 because smallest no
		System.out.println(que.size()); 
		
		
	}

}
