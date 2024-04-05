package org.example.e84;
public class E84NestedForLoops {
    public static void main(String[] args) {
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i >= 1 && i <= 2)) {
                    if (j == 0) {
                        System.out.print("$ ");
                    } else if (j == 1) {
                        System.out.print(" $  ");
                    }
                } else if (i == 0 || i == 3) {
                    System.out.print("$");
                }
            }
             System.out.println();
    }
}}