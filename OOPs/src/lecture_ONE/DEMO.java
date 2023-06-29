package lecture_ONE;

import java.util.Arrays;

public class DEMO {


    public static void main(String[] args) {

        Integer a = 10;
//Integer b = new Integer(a.hashCode());
        Integer b = a.hashCode();
        System.out.println(b);

//        final int MARKS = 1000;
//        MARKS = 200;//shows error because we cannot change final value once its initialized


        car c = new car(2,14000,"Automatic");

        //car c = new car();

//        c.id = 1;
//        c.engin = 1200;
//        c.brakes = "ABS";
        System.out.println(c.toString());

//        car[] car = new car[5];
//        System.out.println(Arrays.toString(car));

    }


    static class car {

        int id = 1;
        int engin = 1200;
        String brakes = "ABS";

//        int id ;
//        int engin ;
//        String brakes ;

//        public car() {
//            this.id = 1;//user define default values
//            this.engin = 1200;//user define default values
//            this.brakes = "ABS";//user define default values
//        }



//        public car(int id, int engin, String brakes) {
//            this.id = id;
//            this.engin = engin;
//            this.brakes = brakes;
//        }


        public car(int id, int engin, String brakes) {
            this.id = id;
            this.engin = engin;
            this.brakes = brakes;
        }

        @Override
        public String toString() {
            return "car{" +
                    "id=" + id +
                    ", engin=" + engin +
                    ", brakes='" + brakes + '\'' +
                    '}';
        }
    }




}
