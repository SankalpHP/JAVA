package inheritance;

public class Main {

    public static void main(String[] args) {

//             BoxWeight box1  = new BoxWeight();
//                BoxWeight box2  = new BoxWeight(120);
//        BoxWeight box3  = new BoxWeight();
//        BoxWeight box4  = new BoxWeight(23,34,56,67);

//        System.out.println(box1.l);
////        System.out.println(box2.l);
////        System.out.println(box2.weight);
////        System.out.println(box2.w);
////        System.out.println(box2.h);

        Box box4  = new BoxWeight(23,34,56,67);//// object of child class assigned to a parent class
        //System.out.println(box4.l);
        System.out.println(box4.getL());
        System.out.println(box4.h);
        System.out.println(box4.w);

        System.out.println();

        BoxWeight box5  = new BoxWeight(23,34,56,67);
        //System.out.println(box5.l);
        System.out.println(box5.getL());
        System.out.println(box5.h);
        System.out.println(box5.w);
        System.out.println(box5.weight);


    }
}
