package linkedlist;

import java.util.LinkedList;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		LinkedList<Double> LST = new LinkedList<Double>();
		
		
		LST.add(5.55);
		LST.addFirst(6.55);//add a element at start of LinkList
		LST.addLast(7.55);
		LST.add(9.55);
		
		System.out.println(LST.clone());
		System.out.println(LST.contains(5.55));
		System.out.println(LST.lastIndexOf(LST));
		System.out.println(LST.size());
		System.out.println(LST.peek());
		System.out.println(LST.hashCode());
	}

}
