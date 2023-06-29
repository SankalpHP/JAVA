package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes sh = new Shapes();
       Circle cr  =  new Circle();
       Square sq = new Square();
       Triangle tr = new Triangle();

       sh.aera();
       cr.aera();
       sq.aera();
       tr.aera();

       Shapes.Greeting();
    }
}
