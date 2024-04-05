package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        //Write a program that creates a String array with size 7.
        //Ask the user to input Days of a week beginning with Sunday using Scanner class.
        //Add these inputs to your array and then print all values from that array
        String[] week = new String[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < week.length; i++) {
            System.out.println("Please enter day " + (i+1) + " of the week");
          week[i] = scanner.nextLine();}
        for(int i = 0; i < week.length; i++){
            System.out.println(week[i]);

            }
        }
    }



//Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the starting number of loop");
//        int start= scanner.nextInt();
//        System.out.println("Please enter the ending number of loop");
//        int end=scanner.nextInt();
//        while(start<end){
//            System.out.print(start+" ");
//            start++;