package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
    Method m1 = new Method();
    int[] array1 = {10, 20};
    int sum1 = m1.addArray(array1);
    System.out.println("Addition "+sum1+" ");

    Method m2 = new Method();
    int[]array2={15,2};
    int mult1=m2.multArray(array2);
        System.out.println("Multiplication "+mult1+" ");

        Method m3=new Method();
        int[]array3={10,0};
        int subt1=m3.subtArray(array3);
        System.out.println("Subtraction "+subt1+" ");
}}