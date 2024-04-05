package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        //Create an int array of integers with a size of 5 and input values with Scanner.
        //Don't print prompt questions for a user.
        //Using loop print out each element of the array that should look like the output below
        int[] value = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        for (int i = 1; i <= value.length; i++) {
            System.out.println(10 * i);
        }

    }


}


