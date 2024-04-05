package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
     //write the code from here
//Write a program that sums all numbers that are on even index and on even row
        int sum=0;
        for(int i=0; i<a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum= (a[0][0])+(a[0][2])+(a[2][0])+(a[2][2]);

            }
        }System.out.println(sum);
             {

            }
        }
    }
