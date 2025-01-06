package models.animals;

import models.inters.Edible;

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
