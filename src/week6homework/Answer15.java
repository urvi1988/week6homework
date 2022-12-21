package week6homework;

//  15. Write a Java program to swap two variables.

public class Answer15 {

    public  static void main(String[]args){ // main method

        int a=20, b= 10;  // static variables

        System.out.println(" Before swapping values are "+a+" "+b);// before swapping

        int x=a;  // third variable
            a=b;
            b=x;


        System.out.println("After swapping values are " +a+" "+b); // after swapping


    }
}
