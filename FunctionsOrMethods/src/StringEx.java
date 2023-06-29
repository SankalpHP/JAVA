import java.util.Scanner;

public class StringEx {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name");
        String naam = in.nextLine();
        String Message = greeting(naam);
        System.out.println(Message);

         String Sis =  greeting1("Ankita Selokar");
        System.out.println(Sis);
    }

    public static String greeting(String Name){
        String greet = "Hello " + Name;
        return greet;
    }

    public static String greeting1(String Name){
        String greet = "Hello " + Name;
        return greet;
    }




}
