package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> has = new HashMap<String,Integer>();

		//avoid duplications of element
		
		has.put("english", 90);
		has.put("maths", 100);
		has.put("social", 80);
		has.put("Hindi", 90);
           
		has.put("maths", 95);
		has.put("social", 80);
		
		System.out.println(has.clone());
		System.out.println(has.get("maths"));
		System.out.println(has.size());
		
		Set<String> keys = has.keySet();
		
		for(String k : keys)
			System.out.println(k);
	}

}
