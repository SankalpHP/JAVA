package access;



public class baseclass{
	public int a;
	private int b;
	protected int c;
	 int  d;
	 public void baseclass () {
		  a = 10;
		  b = 20;
		  c = 30;
		  d = 40;
	 }
}
class myderivedclass extends baseclass{
	public myderivedclass(){
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}



public class Myaccess {
	
	public static void main (String args []) {
		
		baseclass bas = new baseclass();
		bas.a = 10;
		bas.b = 20;
		bas.c = 30;
		bas.d = 40;
		
	}

}
