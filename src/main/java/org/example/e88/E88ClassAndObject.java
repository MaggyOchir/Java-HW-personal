package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        Main dog1 = new Main();
        dog1.breed = "Husky";

        dog1.bark(dog1.breed);
        dog1.run(dog1.breed);
        dog1.play(dog1.breed);

        Main dog2 = new Main();
        dog2.breed = "Bulldog";

        dog2.bark(dog2.breed);
        dog2.run(dog2.breed);
        dog2.play(dog2.breed);

        Main dog3 = new Main();
        dog3.breed = "Labrador";

        dog3.bark(dog3.breed);
        dog3.run(dog3.breed);
        dog3.play(dog3.breed);
    }
}