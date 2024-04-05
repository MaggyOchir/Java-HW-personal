package org.example.e26;

import java.util.Scanner;

public class E26ScannerClass {
    public static void main(String[] args) {


       Scanner name=new Scanner(System.in);
        System.out.println("In:");
        String teacher=name.nextLine();
        if(teacher.equals("Chen")){
            System.out.println("teacher");}
        else{
            System.out.println("student");}
        }}
