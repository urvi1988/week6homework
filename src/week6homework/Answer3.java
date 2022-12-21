package week6homework;

//  3. Write a Java programme using the following steps.

public class Answer3 {
    String name= "Urvi"; // Instance variable
    static String surname= "Patel"; // static variable

    void o1()     {      // Declare instance method

        System.out.println(name);    // called instance variable directly
        System.out.println(surname);   // called static variable directly

    }
    static void m2()        {     // Declare static method

        Answer3 obj= new Answer3();  // create an object

        System.out.println(obj.name);  // Called Instance Variable to static method using object name
        System.out.println(surname);  //  Called static variable to static method Directly

    }
     public static void main( String [] args ){  // main method
    Answer3 obj= new Answer3();   // instance method
         obj.o1();// calling instance method to ststic method using object
         m2(); // calling static method to static method directly




     }






    }
