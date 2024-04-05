package org.example.e24;

import javax.swing.*;
import java.util.Scanner;

public class E24ScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name=scanner.next();
        System.out.println("Your name is "+name);

    }
}
