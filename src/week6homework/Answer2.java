package week6homework;

//  2. Write a Java programme using the following steps.

public class Answer2 {

    static String name= "Urvi"; // static variable
    static String surname="Patel"; // static variable

    static void m2()  // static method
    {
        System.out.println(name);// calling static variable to static method directly
        System.out.println(surname); // calling static variable to static method directly
    }

    public static void main(String[]args) { // main method
        m2(); // called static method to static variable directly



    }

}