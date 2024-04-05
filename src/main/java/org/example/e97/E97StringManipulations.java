package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = scanner.nextLine();
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");}
        else if (browser.equalsIgnoreCase("Firefox")){
            System.out.println("Proceed with Firefox browser");}
        else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");}
        else{
            System.out.println("Invalid browser");}
        }}
