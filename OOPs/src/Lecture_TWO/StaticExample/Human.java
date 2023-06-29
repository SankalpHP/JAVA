package Lecture_TWO.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;

    static int Population;

    static void message() {
        System.out.println("Hello World");
        //System.out.println(this.age);// cant use this over here
        System.out.println(Population);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.Population += 1;
    }
}
