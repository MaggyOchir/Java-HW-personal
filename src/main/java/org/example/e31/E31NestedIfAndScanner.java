package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean sunny=true;
        int temp=95;
        System.out.println("Is it sunny outside?");
        if(sunny==false){
            System.out.println("I should stay home and practice Java");}
        if(sunny==true){
        System.out.println("It is a sunny day, I should go somewhere!");
        System.out.println("What is the temperature outside?");
        if(temp>85){
            System.out.println("I am going to the beach");
            if(temp<85){
                System.out.println("I am going to a park");
            }}}}}

