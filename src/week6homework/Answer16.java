package week6homework;

// Write a Java program to add two binary numbers.

public class Answer16 {

    void m1 ()
    {
        byte a= 0b10;
        byte b= 0b11;
        int  result;
        result= a+b;

        System.out.println("Binary number is:" + Integer.toBinaryString(result) +".");


    }

    public static void main(String[]args) {

        Answer16 g= new Answer16();
        g.m1();
    }
}
