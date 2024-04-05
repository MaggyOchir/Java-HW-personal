package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        Main car1=new Main();
        car1.carColor="Black";
        car1.carYear=2019;
        car1.carMake="BMW";
         car1.myCar(car1.carColor, car1.carYear, car1.carMake);

        Main car2=new Main();
        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";
        car2.myCar(car2.carColor, car2.carYear, car2.carMake);

    }
}
