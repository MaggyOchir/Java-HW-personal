package org.example.e73;

import java.util.Scanner;

import static java.lang.System.*;

public class E73Arrays {
    public static void main(String[] args) {
//Create an array of integers that will store 5 elements taken from a user
//Don't print any prompt message for the user
//Then print out all the elements you have created in the first loop in reverse order.
        int[] element = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < element.length; i++) {
            element[i] = scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(element[i]);

        }
    }
}

