package models.animals;

public class Animal {


    /**
     * private methods are not inherited or can not access using an instance
     */
    private void print(String statement) {
        System.out.print(statement);
    }

    /**
     * default access level methods are only inherited when subclass
     * is in the same package ( package private methods )
     **/
    void eat() {
        System.out.println("Animal eat something");
    }

    /**
     * protected methods are inherited regardless of package
     */
    protected void drink() {
        System.out.println("Animal drink water");
    }

    /**
     * public methods are inherited anyway
     */
    public void makeNoise() {
        print("Animal Generic Noise in Animal Class");
    }

    public void makeNoise(String animal) {
        print(animal + " make noise in Animal Class");
    }

    public static void covertToStream(){
        System.out.println("Animal is converting...");
    }
}
