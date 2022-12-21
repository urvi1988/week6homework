package week6homework;

// Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
public class Answer10 {  //  declare class name

    int z = 5;  //Instance Varaible
    static int p;

    public static void main(String[] args) { // main method
        Answer10 t = new Answer10();// here Answer 10 is class name, t is a reference variable, new is keyword and Answer10() ia Constructor

        for ( p = 1; p <= 10; p++) {

            System.out.println(t.z + "  *  " + p + "  =  " + t.z * p);

        }


    }
}