package org.example.e22;

import java.util.Scanner;

public class E22ScannerClass {

    /*Write a program to take username, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scan.nextLine();
        System.out.println("Enter your mobile number");
        String mobile=scan.nextLine();
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobile);
    }
}
