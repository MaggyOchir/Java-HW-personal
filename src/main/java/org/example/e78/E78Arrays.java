package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
//write the code from here
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}


