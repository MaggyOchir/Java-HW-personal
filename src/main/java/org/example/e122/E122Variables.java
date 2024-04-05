package org.example.e122;
public class E122Variables {
    String country;
    String capital;
    int ppln;
    E122Variables(String eCountry, String eCaptial, int ePpln ) {
        country = eCountry;
        capital = eCaptial;
        ppln = ePpln;}
        void printInfo() {
            System.out.println("The capital of " + country + " is " + capital + " and population is " + ppln);
        }
        public static void main(String[] args) {
        E122Variables c1= new E122Variables("USA","Washington DC",330000000);
        E122Variables c2= new E122Variables("Kazakhstan","Astana",18500000);
    c1.printInfo();
    c2.printInfo();

    }
}
