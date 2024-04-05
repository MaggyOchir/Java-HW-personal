package org.example.e28;

import java.util.Scanner;

public class E28ScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length");
        int length=scanner.nextInt();
        System.out.println("Please enter the width");
        int width=scanner.nextInt();
        if(length==width){
        System.out.println("The shape of your object is square");}
        else{
        System.out.println("The shape of your object is rectangle");}
    }}
