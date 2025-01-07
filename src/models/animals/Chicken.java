package models.animals;

import models.interfaces.Edible;

/**
 * when extending a class we define `is` relationship.
 * Chicken is an Animal. Here we can use a Chicken object,
 * where ever Animal reference is used.
 * */
public class Chicken extends Animal implements Edible {


    @Override
    public void isEdible() {
        System.out.println("Chicken is edible");
    }

    @Override
    public void makeNoise(String animal) {
        System.out.println(animal + " coook cooo");
    }

    @Override
    public void makeNoise() {
        System.out.println("coook cooo");
    }


    @Override
    public void eat() {
        System.out.println("Chickens eat grains");
    }

    @Override
    public void drink() {
        System.out.println("Chicken drink water");
    }
}
