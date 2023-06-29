package Polymorphism;

public class Number {
//Method OverLoading
    double sum(int a, int b) {
        return a + b;
    }

    double sum(double a, int b) {
        return a + b;
    }


    int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Number num = new Number();
        num.sum(30, 29);

        num.sum(30, 29, 40);


    }
}
