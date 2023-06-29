package Lecture_TWO.StaticExample.Singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Inside a Singleton class");
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj only is created or not

        if(instance == null){
          instance = new Singleton();
            System.out.println("Inside Condition");
        }
        return instance;
    }

}
