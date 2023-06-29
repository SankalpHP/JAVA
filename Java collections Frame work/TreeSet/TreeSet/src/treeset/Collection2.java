package treeset;

import java.util.TreeSet;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> tree = new TreeSet<String>();
		
		//TreeSet avoid duplicate data as well as print it in proper order
		
		tree.add("P90");
		tree.add("M4");
		tree.add("Ak");
		tree.add("Tavor");
		
		tree.add("M4");
		tree.add("Tavor");
		tree.add("Ak");
		tree.add("P90");
		
		System.out.println(tree.size());//TreeSet avoid duplicate data
		
		System.out.println("=====================================");
		
		for(String s : tree)
		System.out.println(s);//as well as print it in proper order
		
	}

}
