package stack;

import java.util.Stack;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		
		System.out.println(st.clone());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		
	}

}
