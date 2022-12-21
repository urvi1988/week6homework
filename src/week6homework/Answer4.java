package week6homework;

//  4. Write a Java programme using the following steps.

public class Answer4 {

    int a = 10;  // instance variable
    double b = 10.5d; // instance variable
    static float c = 10.20f;  // static variable
    static String name = "Banana"; // static variable

    void m1() // Declare instance method

    {
        System.out.println(a);// called instance variable directly
        System.out.println(b); // called instance variable directly
        System.out.println(c); //  called static variable directly
        System.out.println(name); //  called static variable directly

    }

static void m2() // Declare static variable

{
    Answer4 obj= new Answer4(); // create an object

    System.out.println(obj.a);// called instance variable to static varible by objective
    System.out.println(obj.b); // called instance variable to static varible by objective
    System.out.println(obj.c); //  called instance variable to static varible by objective
    System.out.println(name); //  called static variable directly

}
public static  void main(String[] args) { // main method

Answer4 a = new Answer4();
a.m1();  //Called Instance method to Static method using object name

m2();    //Called static method to Static method Directly

}

}