package stack;

import java.util.Stack;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	    Stack<String> sta = new Stack<String>();
	    
	    sta.push("sun");
	    sta.push("moon");
	    sta.push("venus");
	    sta.push("mars");
	    
	    System.out.println(sta.clone());
	    System.out.println(sta.pop());
	    System.out.println(sta.peek());
	    System.out.println(sta.size());
	    System.out.println(sta.elementAt(0));
		
	}

}
