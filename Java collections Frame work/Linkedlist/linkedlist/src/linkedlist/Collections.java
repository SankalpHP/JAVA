package linkedlist;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> info = new LinkedList<Integer> ();
		
		info.add(100);
		info.add(200);
		info.add(300);
		info.add(400);
		info.add(500);
		
		/*info.addFirst(50);
		info.addLast(550);*/
		
		System.out.println(info.get(2));
		System.out.println(info.size());
		System.out.println(info.indexOf(200));
		System.out.println(info.contains(400));
		
		/*System.out.println(info.contains(600));
		System.out.println(info.indexOf(550));*/

	}

}
