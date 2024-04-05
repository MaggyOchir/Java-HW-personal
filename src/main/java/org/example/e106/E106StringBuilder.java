package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
StringBuilder str=new StringBuilder("hello");
        str.append(" world");
        String st=new String(str);
        System.out.println(st.toUpperCase());
    }
}

