package VariableArguments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
        multiple(10,20,"Sankalp","Rahul","Sumo");

    }

    // When we don't know how many number of args we wanna pass we use this Variable Arguments
    static void fun(int...v){//Its take value as a Array Internally
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , String...v){// we can also pass fix args with VarArgs
        System.out.println(Arrays.toString(v));
    }
}
