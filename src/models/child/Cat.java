package models.child;

import models.animals.Animal;
import models.inters.Edible;

public class Cat extends Animal implements Edible {


    @Override
    public void isEdible() {
        System.out.println("Can not eat cat");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void drink() {
        System.out.println("Cat drinks water and milk");
    }
}
