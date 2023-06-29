package Questions;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = in.nextInt();
        salary(salary);
    }

    static void salary(int payment){

        if (payment <= 10000){
             payment += 1000;
        }else {
            payment += 2000;
        }
        System.out.println(payment);
    }
}
