package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 20.00d;
    double b = 80.00d;
    double result =( a + b ) * 100.00;//20.00+80.00*10000.0=100.00.
        System.out.println("a + b* 100.00="+result);
        double remiander=result%40.00d;//10000.0%40.00=00.
        System.out.println(("result % 40.00=" + remiander));
        boolean value = (remiander==0) ? true : false;//if remainder is zero then true, if not false.
        System.out.println("reminder=" + value);
        if(!value)//value is not equal to zero.
        System.out.println("got some reminder");// if not equal to zero then"got some errer".


        }

    }

