package hashset;

import java.util.HashSet;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> ha = new HashSet<Integer>();
		
		ha.add(35);
		ha.add(30);
		ha.add(80);
		ha.add(60);
		
		ha.add(60);
		ha.add(30);
		ha.add(80);
		ha.add(35);
		
		System.out.println(ha.size());
		//System.out.println(ha.clone());
		
		//System.out.println(ha.hashCode());
		//System.out.println(ha.clone());
		
		System.out.println("================================");
		
		for(Integer d : ha)
			System.out.println(d);
		

	}

}
