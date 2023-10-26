package Structural_Design_Pattern.Adapter.Bird;

public class Client { // The Adapter Pattern converts the interface of a class into another interface as the clients expect.
    public static void main(String args[]) { // Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
        Bird sparrow = new Sparrow();
        System.out.println("...Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        ToyDuck toyDuck = new PlasticToyDuck();
        System.out.println("...ToyDuck...");
        toyDuck.squeak();

        // Wrap a bird in a birdAdapter so that it behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        // bird behaving like a toy duck
        System.out.println("...BirdAdapter...");
        birdAdapter.squeak();
    }
}
