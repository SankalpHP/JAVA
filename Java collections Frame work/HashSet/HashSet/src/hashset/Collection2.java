package hashset;

import java.util.HashSet;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> str = new HashSet<String>();
		
		//HashSet avoid duplication of data
	    //also not print it in a Order
		
		str.add("name");
		str.add("class");
		str.add("roll");
		str.add("school");
		
		str.add("class");
		str.add("roll");
		str.add("name");
		str.add("school");
		
		System.out.println(str.size());
		
		for(String d : str)
			System.out.println(d);

	}

}
