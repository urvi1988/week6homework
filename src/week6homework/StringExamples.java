package week6homework;

import java.awt.image.renderable.RenderableImage;

public class StringExamples {

    public static void main(String[] args) {
        String name= "My name is patel"; // String declaration

        System.out.println("The length of string is" + name.length());    // print lenght of string

        System.out.println("The char value at index 3 is: " + name.charAt(3));// print character value at given index number

        System.out.println("The name is :" +name.concat (name));// its combines specified string at the end of this string.

        System.out.println(" The contain is:"+name.contains("patel"));// Return true if the character found in string.

        System.out.println(" The string starts with:"+ name.startsWith("My"));// check if this string starts with given prefix.

        System.out.println("The string ends with:"+ name.endsWith("patel")); // check if this string ends with given prefix.

        System.out.println("The string equals with:"+ name.equals("is")); // compare the content of two given string

        System.out.println("The index value is :" + name.indexOf("p"));// return index of given character value

        System.out.println(" Is this string empty:" + name.isEmpty());// check if this string is empty

        System.out.println(" The replace is:" + name.replace("p","v"));// return a string replacing all the old character to new character

        System.out.println(" The substring is:" + name.substring(7)); // returns the part of the string

        System.out.println( "The string to Character Array:"+ name.toCharArray());// convert the string into character array

        System.out.println("The string to lowe case:" + name.toLowerCase());// return the string into lower case letter

        System.out.println("The string to Uppercase:" + name.toUpperCase());// return the string into uppercase

        System.out.println("The string is trim:"+ name.trim());// eliminates leading and trailing spaces

        StringBuffer sb=new StringBuffer(name); // create an object for reverse method
        System.out.println(sb.reverse());// its reverse the string

    }
}
