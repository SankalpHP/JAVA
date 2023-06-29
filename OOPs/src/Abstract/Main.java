package Abstract;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(22);
        System.out.println(son.age);
        son.career();
        son.partner();

        daughter daughter  = new daughter(24);
        System.out.println(daughter.age);
        daughter.career();
        daughter.partner();


         //parent par = new parent();can't create a object of abstract class


        parent.hello();
        daughter.normal("normal in daughter");
        son.normal("normal in son");

    }
}
