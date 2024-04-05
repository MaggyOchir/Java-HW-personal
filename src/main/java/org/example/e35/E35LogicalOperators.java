package org.example.e35;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E35LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Do you need a loan? (true/false)");
    // System.out.println("What is your credit score?");
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Do you need a loan?");
        boolean loan= scanner.nextBoolean();
        if(loan) {
            //System.out.println("What is your credit score?");
            int score = scanner.nextInt();
            if (score < 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (score >= 600 && score <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (score >= 701 && score <= 800) {
                System.out.println("The eligibility is Eligible");
            } else if (score > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
                    System.out.println("The eligibility is Unknown");
                }
            }}