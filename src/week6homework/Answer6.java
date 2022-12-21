package week6homework;

//  6. Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).

import java.awt.geom.Area;

public class Answer6{

    public static void main(String[] args) {

        double PI = 3.14;
        int r = 5;

        double Area = PI * r * r;


        System.out.println("Area of circle is: " + Area);
    }

}
