package poly;


 class EnglishMessage{
	 public void sayhi() {
		 System.out.println("hi");
	 }
	 public void sayhello() {
		 System.out.println("Hello");
	 }
	 public void sayMorning() {
		 System.out.println("good moring");
	 }
	 
 }
 
 class HindiMessage extends EnglishMessage{
     
	 @Override
	 public void sayMorning() {
		 System.out.println("subhodaya");
	 }
	 
	 public void saytoEnglishPeople() {
		 
		 System.out.println("Hi how are you");
		 super.sayMorning();
	 }
	
 }

public class Overrides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HindiMessage msg = new HindiMessage();
         msg.sayhi();
         msg.sayhello();
         msg.sayMorning();
         
         System.out.println("===================================================");
         msg.saytoEnglishPeople();
	}

}
