package models.animals;

import models.interfaces.Edible;


/**
 * when extending a class we define `is` relationship.
 * Lion is an Animal. Here we can use a Lion object,
 * where ever Animal reference is used.
 * */
public class Lion extends Animal implements Edible {


    @Override
    public void makeNoise() {
        System.out.println("roar in Lion Class");
    }

    @Override
    public void makeNoise(String animal) {
        System.out.println(animal + " roar in Lion Class");
    }

    // method overloading
    public String makeNoise(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("roar in Lion Class");
        }
        return "roar";
    }

    @Override
    public void isEdible() {
        System.out.println("Can not eat a lion");
    }

    public static void covertToStream(){
        System.out.println("Lion is converting...");
    }

    public void  playDead(){
        System.out.println("Lion is playing dead");
    }

}
