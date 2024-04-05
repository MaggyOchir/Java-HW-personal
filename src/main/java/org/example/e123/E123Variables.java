package org.example.e123;
//Declare the instance variables to hold: integer values String values double values boolean values float values
// Access instance variables and then print them all without assigning any values to them.
// Print variables one by one the same sequence that you declare them.
/*0
        null
        0.0
        false
        0.0*/
public class E123Variables {
int num=0;
String letter="";
double num1=0.0;
boolean f=false;
float num2=0.0f;

public E123Variables(int eNum, String eLetter, double eNum1, boolean eF, float eNum2) {
    num = eNum;
    letter = eLetter;
    num1 = eNum1;
    f = eF;
    num2 = eNum2;}
    public void printInfo () {
        System.out.println(num);
        System.out.println(letter);
        System.out.println(num1);
        System.out.println(f);
        System.out.println(num2);
    }

    public static void main(String[] args) {
    //E123Variables m=new E123Variables();
    //m.printInfo();

    } //hudlaa
}
