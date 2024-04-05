package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Are you thirsty?");
    // System.out.println("Are you sleepy?");

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    //System.out.println("Are you thirsty?");
        boolean thirsty=scanner.nextBoolean();
    //System.out.println("Are you sleepy?");
        boolean sleepy=scanner.nextBoolean();
    if(thirsty && !sleepy) {
        System.out.println("Looks like you need to drink water");
    }
    if(thirsty && sleepy) {
        System.out.println("Looks like you need to drink coffee");
    }
        if (!thirsty && sleepy) {
            System.out.println("Looks like you need to drink tea");
    }
        if(!thirsty && !sleepy){
            System.out.println("Looks like you need to drink nothing");
    }
    }}