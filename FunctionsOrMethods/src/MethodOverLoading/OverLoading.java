package MethodOverLoading;

import java.util.Arrays;


public class OverLoading {

    public static void main(String[] args) {

        sum(10,20);
        sum(10,30,40);

        Value(67);
        Value("Sankalp Selokar");

        demo(1,2,3,4,5,6,7,8,9,10);
        demo("Sankalp","Anitka","Sister and Brothers");

    }
    //when the methods or a fuctions have a Same name but there args are different means there parameters are different
    // is called as method overloading ,during method overloading java decides at run time which method its really want
    // to execute
    static void sum(int a , int b){
         int c = a + b;
        System.out.println(c);
    }

    static void sum(int a , int b , int  c){
         int d = a + b + c;
        System.out.println(d);
    }

    static void Value(int a){
        System.out.println(a);
    }

    static void Value(String a){
        System.out.println(a);
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }

}
