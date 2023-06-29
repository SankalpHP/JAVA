package hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashaMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> in = new HashMap<Integer,Integer>();
		
		//avoid duplications of element
		
		
		in.put(100, 4);
		in.put(400, 7);
		in.put(1000, 11);
		in.put(700, 8);
		
		in.put(400, 9);
		in.put(1000, 10);
		
		
		System.out.println(in.clone());
		System.out.println(in.get(1000));
		System.out.println(in.size());
		
		Set<Integer> keys = in.keySet();
		for(int k : keys)
			System.out.println(k);

	}

}
