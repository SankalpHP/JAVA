package Lecture_TWO.StaticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {

    static int a  = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

           StaticBlock Obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock Obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}

	//Static variables are independent on class 
		// call them directly by class name
		// no need to create a obj of that class and class them directly call them
