package org.example.e121;

import org.example.e120.E120Variables;

//declare 3 instance variables to hold an integer, double and char values.
// Create 2 instances of the class and assign values to variables and the print them
//Output:
//10
//10.23
//a
//100
//100.23
//s
public class E121Variables {
    int num1;
    double num2;
    char letter;
       E121Variables(int eNum1, double eNum2, char eLetter){
        num1=eNum1;
        num2=eNum2;
        letter=eLetter;
    }
    void printInfo(){
             System.out.println(num1+"\n"+num2+"\n"+letter);
       }

       void print(){
           int num=90;
           char let='s';
           System.out.println();
       }
    public static void main(String[] args) {
        E121Variables e=new E121Variables(10,10.23,'a');
        e.printInfo();

    } //hudlaa
}
