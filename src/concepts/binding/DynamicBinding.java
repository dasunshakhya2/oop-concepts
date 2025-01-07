package concepts.binding;

import models.animals.Animal;
import models.animals.Chicken;
import models.animals.Lion;
import models.zoo.Zoo;

public class DynamicBinding {

    public static void main(String[] args){
        Zoo zoo = new Zoo();

        Animal lion = new Lion();
        Animal chicken = new Chicken();

        zoo.animalMakeNoise(lion);
        zoo.animalMakeNoise(chicken);
    }
}
