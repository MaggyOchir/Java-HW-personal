package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
    //Create an array of names that will hold 5 String elements. Names must be taking from a user.
        // Print out the first three characters of each element of the array, one per line.
        //  Note: every array element must be at least 3 characters long.

        String name1= input.nextLine();
        String name2= input.nextLine();
        String name3= input.nextLine();
        String name4= input.nextLine();
        String name5= input.nextLine();

        System.out.println(name1.substring(0,3));
        System.out.println(name2.substring(0,3));
        System.out.println(name3.substring(0,3));
        System.out.println(name4.substring(0,3));
        System.out.println(name5.substring(0,3));
    }
}


