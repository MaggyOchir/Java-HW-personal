package org.example.e92;

public class E92StringManipulations {
    public static void main(String[] args) {
        String s1 = "hello how are you";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("world"));
        System.out.println(s1.endsWith("are"));
        System.out.println(s1.endsWith("you"));
    }
}
/*Validate if the string ends with "u" prints the boolean value accordingly.
Validate if the string ends with "world" prints the boolean value accordingly.
Validate if the string ends with "are" prints the boolean value accordingly.
Validate if the string ends with "you" prints the boolean value accordingly.*/