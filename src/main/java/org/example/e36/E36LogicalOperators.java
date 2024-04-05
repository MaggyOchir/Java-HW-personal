package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Please enter two strings");
    //System.out.println("Please enter two numbers");
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Please enter two strings");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        //System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(word1.equals(word2)&&number1==number2){
            System.out.println("AND");}
            else if(word1.equalsIgnoreCase(word2)||number1==number2){
                System.out.println("OR");}
                if(!(word1.equalsIgnoreCase(word2))&&number1!=number2){
                    System.out.println("NONE");
                }
            }}

