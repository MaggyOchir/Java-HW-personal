package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        int a = 8;
        for (int i = 1; i < 14; i++) {
            if (i <=8) {
                a=a-1;
                for (int j = 1; j <= a; j++) {
                    System.out.print(j + " ");
                }
            }

        System.out.println();

    }}}