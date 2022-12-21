package week6homework;

//  Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.

public class Answer13 {

    public static void main(String[]args){

        int a= 10;
        int b= 20;
        int c= 15;
        // declare as a float

        float total,average;

        total= a+b+c;
        System.out.println("Total : " + total);

        average = total/3;
        System.out.println("Average :" + average);


    }
}
