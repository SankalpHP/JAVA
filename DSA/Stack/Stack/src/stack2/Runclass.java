package stack2;

public class Runclass {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.Push(244);
		st.Push(123);
		st.Push(421);
		st.Push(23);
		
		
		System.out.println(st.peek());
		System.out.println(st.Size());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.Size());
		
	}

}
