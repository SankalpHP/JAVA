package queue;

import java.util.PriorityQueue;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		//Queue allows duplication
		
		pq.add("Dad");
		pq.add("mom");
		pq.add("child");
		pq.add("daughter");
		
		pq.add("daughter");
		pq.add("child");
		pq.add("mom");
		pq.add("Dad");
		
		
		System.out.println(pq.size());
		System.out.println(pq.poll());
		System.out.println(pq.size());
		System.out.println(pq.hashCode());
		pq.clear();
		
	
		
	}

}
