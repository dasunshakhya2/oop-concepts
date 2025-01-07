package concepts.polymorphism;

import models.animals.Animal;
import models.animals.Lion;
import models.interfaces.Edible;

public class Polymorphism {

    public static void main(String[] args) {

        // Polymorphism

        Lion lion = new Lion();


        // here we use super type reference for the Lion object
        Animal animal = lion;
        Edible edibleAnimal = lion;
        Object object = lion;


        animal.makeNoise();
        animal.makeNoise("Lion");
        // animal.isEdible();
        // animal.playDead()
        Animal.covertToStream();

        System.out.println();


        edibleAnimal.isEdible();
        // edibleAnimal.makeNoise();
        // edibleAnimal.playDead();

        System.out.println();

        lion.isEdible();
        lion.makeNoise();
        lion.makeNoise(3);
        lion.makeNoise("Lion");
        lion.playDead();
        Lion.covertToStream();

    }
}
