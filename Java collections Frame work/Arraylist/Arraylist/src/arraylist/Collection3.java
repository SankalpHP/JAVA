package arraylist;

import java.util.ArrayList;

public class Collection3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		ArrayList<Float> arrfl = new  ArrayList<Float>();
		
		arrfl.add((float) 88.88);
		arrfl.add((float) 99.99);
		arrfl.add(1, (float) 881.22);
		arrfl.add((float) 66.66);
		
		System.out.println(arrfl.clone());
		System.out.println(arrfl.contains(881.22));
		System.out.println(arrfl.hashCode());
		System.out.println(arrfl.lastIndexOf(arrfl));
		
		
		
	}

}
