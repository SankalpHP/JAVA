package treemap;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		TreeMap<String,Integer>tr = new TreeMap<String,Integer>();
      
		//avoid duplication and print in a Order
		
		tr.put("science", 100);
		tr.put("social", 100);
	    tr.put("Maths", 100);
	    tr.put("Geo", 100);
	    tr.put("His", 100);
	    
	    tr.put("science", 95);
		tr.put("social", 88);
	    tr.put("Maths", 97); 
	    
	    System.out.println(tr.size());
	    System.out.println(tr.clone());
	    System.out.println(tr.get("science"));
	    System.out.println(tr.get("Maths"));
	    
	    System.out.println("=======================================");
	    
	    Set<String> keys = tr.keySet();
	    
	    for(String s : keys)
	    	System.out.println(s);
	    
	
}
	}


