package overload;


public class Overload {
	
	
	public static int add (int a , int b) {
		return a + b;
	}
	
	public static int add (int a , int b , int c) {
		return a + b + c;
	}
	
	public static int add (float a , float b , float c) {
		return (int) (a + b + c) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      System.out.println("answer = " + (add(10,15)));
      System.out.println("answer = " + (add(10,15,20)));
      System.out.println("answer = " + (add(10,15,25)));

	}

}
