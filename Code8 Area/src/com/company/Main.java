package com.company;

public class Main {

    public static void main(String[] args) {

        area(5.0);
        area(5.0 , 4.0);

    }
         public static double area (double radius){
        if(radius < 0){
            return -1.0;
        }
           double circle  = 3.14 * radius * radius;
             System.out.println("Area of circle = " + circle);
        return 1;

         }
            public static double area (double X , double Y ){

              if( X < 0 && Y < 0){
                  return -1.0;
              }
                 double rectangle = ( X * Y ) ;
                System.out.println("Area of rectngle = " + rectangle);
                 return 1;
            }

}
