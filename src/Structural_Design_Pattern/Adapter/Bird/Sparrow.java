package Structural_Design_Pattern.Adapter.Bird;

public class Sparrow implements Bird { // Implementation of Bird
    public void fly() {
        System.out.println("Flying");
    }
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
