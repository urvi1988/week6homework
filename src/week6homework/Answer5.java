package week6homework;

//  5. Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.

public class Answer5 {

    int a= 10;
    int b= 15;

    void addition (int a, int b)
    {
        System.out.println("Addition is : " +(a + b));
    }

    void multiplication (int a, int b) {

        System.out.println("multiplication is:" +(a * b));
    }
    static void substraction (int a,int b) {

        System.out.println("substraction is:" + (a - b));
    }
    static void division (int a, int b) {

        System.out.println("division is:" + (a / b));
    }

    public static void main(String[] args) {
        Answer5 m= new Answer5();
        m.addition(10,15);
        m.multiplication(10,15);
        division(10,15);
        Answer5.substraction(10,15);
    }








    }






