package com.company;

public class Main {

    public static void main(String[] args) {
        String mystring="dhoni plays cricket";
        System.out.println("mystring=" + mystring);
        mystring=mystring+",scores 200runs.";
        System.out.println("mystring=" + mystring);

        mystring=mystring+",and get out.";
        System.out.println("mystring="+mystring);
        mystring=mystring+'\u00A9';
        System.out.println("mystring="+mystring);

        String   numberstring="250";
        numberstring=numberstring +"350";
        System.out.println("numberstring="+numberstring);

        String valuestring="250";
        double doublevalue=350;
        String stringline=valuestring+                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           doublevalue;
        System.out.println("Stringline="+stringline);



    }
}
