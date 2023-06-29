package inherits;


class algebra {
	
	
	
	public int add(int a , int b) {
		
		System.out.println("sum = "+ (a + b));
		return a + b;
	}
	
	public int mul (int a , int b) {
		System.out.println("mul = " +(20 * 10));
		return a * b;
	}
}

    class totalmath extends algebra{
    	public int sub (int a , int b) {
    		System.out.println("sub = "+(20 - 10));
    	return a - b;
    	}
    	
    	public int div (int a , int b) {
    		System.out.println("div = "+(20/10));
    		return a/b;
    	}
    }

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 
		totalmath tm = new totalmath();
		tm.add(10, 20);
		tm.mul(10, 20);
		tm.sub(20, 10);
		tm.div(20, 10);
	}

}
