package treeset;

import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		//TreeSet avoid duplicate data as well as print it in proper order
		
		tree.add(24);
		tree.add(10);
		tree.add(15);
		tree.add(45);
		
		
		tree.add(24);
		tree.add(15);
		tree.add(45);
		tree.add(10);
		
		System.out.println(tree.size());//TreeSet avoid duplicate data
		
		System.out.println("=================================");
		
		for(int d : tree)
		System.out.println(d);//as well as print it in proper order
	}

}
