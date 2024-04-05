package org.example.e80;

import java.util.Scanner;

public class E80Arrays {
    public static void main(String[] args) {
        int[][] a = {
                //Write a program that prints the total number of elements that are negative AND odd
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        //write code from here
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 != 0 && a[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}






