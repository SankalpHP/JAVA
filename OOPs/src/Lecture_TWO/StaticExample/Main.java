package Lecture_TWO.StaticExample;

public class Main {

    public static void main(String[] args) {

//        Human Sankalp = new Human(22, "Sankalp", 15000, false);
//        Human Rahul = new Human(34, "rahul", 20000, true);
//        Human arpit = new Human(25, "aprit", 30000, false);
//
//        System.out.println(Sankalp.name);
//        System.out.println(Rahul.name);
//        System.out.println(arpit.name);
//
//        System.out.println(Human.Population);
//        System.out.println(Human.Population);
//        System.out.println(Human.Population);

        //Human.message();

        //Greeting();

        Main m  = new Main();
        m.Greeting();
        System.out.println();
        Greeting2();


    }

    public void Greeting() {
        System.out.println("NON-STATIC Welcome to JAVA");
        Closing();
    }

    public static void Greeting2() {
        System.out.println("STATIC Welcome to JAVA");
    }

    public void Closing(){
        Greeting2();
        System.out.println("Close at 7Pm");
    }
}
