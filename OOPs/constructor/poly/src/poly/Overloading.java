package poly;


class algebra{
	
	public int add (int a , int b) {
		System.out.println("sum = "+(a+b));
		return a + b;
	}
	
	public int add( int a , int b , int c) {
		System.out.println("sum = "+(a+b+c));
		return a + b;
	}
	
	public int add(int a , int b , int c , int d) {
		System.out.println("sum = " + (a+b+c+d));
		return a+b+c+d;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         algebra alg = new algebra();
         alg.add(10, 20);
         alg.add(10, 20, 30);
         alg.add(10, 20, 30, 40);
	}

}
