package models.animals;

import models.inters.Edible;

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
