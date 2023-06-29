package Lecture_TWO.StaticExample;

import java.util.Arrays;

public class InnerClasses {// static class are not depend on any other classes


    static class Test{

        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;


        }
    }

    public static void main(String[] args) {

         Test t = new Test("Sankalp");
        Test t2 = new Test("Rahul");

//        System.out.println(t.name);
//        System.out.println(t2.name);

        System.out.println(t);
        System.out.println(t2);





    }
}
