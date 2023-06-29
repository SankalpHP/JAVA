package myproject;

class algebar {
	
	public int add(int a ,int b) {
		return a+b;
	}
	
}

class multiplication extends algebar{
	public int mul(int a, int b) {
		return a*b;
	}
}

class division extends multiplication{
	public int div (int a , int b) {
		return a/b;
	}
}

public class Overriding {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		division div  = new division();
		System.out.println(div.add(12, 2));
		System.out.println(div.mul(12, 20));
		System.out.println(div.div(12, 2));
		

	}

}
