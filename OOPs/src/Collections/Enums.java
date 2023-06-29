package Collections;

public class Enums {

    public static void main(String[] args) {


        enum Week{
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        }

        System.out.println(Week.Monday);
        System.out.println(Week.valueOf("Friday"));

        System.out.println();


        for (Week s : Week.values()){
            System.out.println(s);
        }
    }
}
