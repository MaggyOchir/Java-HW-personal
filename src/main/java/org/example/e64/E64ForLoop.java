package org.example.e64;


import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        System.out.print("Int:");
        Scanner scanner=new Scanner(System.in);
        int end=scanner.nextInt();
        for(int i=0; i<end*2;i++){
            System.out.print(i+" ");
        }



    }
}
