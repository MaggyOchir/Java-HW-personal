package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    // System.out.println("Is it weekend?");
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //System.out.println("Is it a weekend?");
        boolean weekend= scanner.nextBoolean();
        if(!weekend)
            System.out.println("Today you will be learning manual testing");
        if(weekend)
            System.out.println("Today you will be learning Java");

    }
}
