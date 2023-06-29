package strings;

public class StringOp {
	
	private String op() {
		String a = "Sankalp Selokar";
		System.out.println("Length of String " + a.length());
		System.out.println("To Upper Case " + a.toUpperCase());
		System.out.println("To Lower Case " + a.toLowerCase());
		System.out.println("CharAt of " + a.charAt(0));
		return a;
	}
          
	public static void main(String[] args) {
		 StringOp op = new StringOp();
		 op.op();
	}
}
