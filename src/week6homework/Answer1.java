package week6homework;

public class Answer1 {

    // 1. Write a Java programme using the following steps.

    int a=10; // declare instance variable
    int b=20;// declare instance variable

    void m1() // declared instance method
    {
        System.out.println(a); //  called intance variable directly
        System.out.println(b); //  called intance variable directly

    }

        public static void main(String[]args) {

        Answer1 a= new Answer1();
        a.m1();
    }
}
