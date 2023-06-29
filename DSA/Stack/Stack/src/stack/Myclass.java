package stack;

public class Myclass {

	public static void main(String[] args) {
		
		Stack s = new Stack ();
		s.Push(88);
		s.Push(99);
		s.Push(77);
		s.Push(11);
		
		System.out.println(s.isFull());
		System.out.println(s.Size());
		System.out.println(s.peek());
		
	}

}
