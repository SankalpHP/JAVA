package overriding;

class english {
	public  english () {
		System.out.println("Hello");
		System.out.println("good morning");
		System.out.println("have a nice day");
		
	}
	
}

class hindi extends english{
public  hindi() {

	System.out.println("namaste");
	System.out.println("shubh sakal");
	
}
}


public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hindi hin = new hindi();
		System.out.print(((hindi) hin));

	}

}
