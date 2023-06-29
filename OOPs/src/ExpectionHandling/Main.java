package ExpectionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {

        CIA(20);

//        try {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter a");
//            int a = in.nextInt();
//            System.out.println("Enter b");
//            int b = in.nextInt();
//            operation(a,b);
//
//        } catch (InputMismatchException e) {
//            System.out.println("InputMismatchException");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//        } catch (Exception e) {
//            //System.out.println(e.getMessage());
//            System.out.println("InputMismatchException");
//        } finally {
//            System.out.println("Check your Input Values");
//        }

    }

    public static void operation(int a, int b) throws ArithmeticException {

        int c = a + b;

        System.out.println(c);

    }

    static int divid(int a , int b) throws ArithmeticException{

        if (b == 0) {
            throw new ArithmeticException("please do not divide by Zero");
        }
        return a/b;
    }

    static void CIA(int age) throws MyException {

        if (age < 18) {
            throw new MyException("Access Denied in CIA");
        }else
            System.out.println("Access granted in CIA");
    }

}
