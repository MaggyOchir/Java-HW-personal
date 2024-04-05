package org.example.e120;

public class E120Variables {
    int year;
    String schoolName;
    int batch;

  E120Variables(int eYear, String eSchoolName, int eBatch){
        year=eYear;
        schoolName=eSchoolName;
        batch=eBatch;
    }
    void printInfo(){
        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
    }
    public static void main(String[] args) {
        E120Variables s=new E120Variables(2020,"Syntax",6);
        s.printInfo();
    }
}