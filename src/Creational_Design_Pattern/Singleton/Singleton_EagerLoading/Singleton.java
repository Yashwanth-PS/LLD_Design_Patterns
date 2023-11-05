package Creational_Design_Pattern.Singleton.Singleton_EagerLoading;

public class Singleton {
    private static Singleton instance = new Singleton(); // Step 1: Private Holder Attribute  To hold the object
    private Singleton() { // Step 2: Restrict Access to Constructor

    }
    // Step 3: Create a public method to return a singleton object
    public static Singleton getInstance() { // Step 4: Since we don’t have an object, Make the method static
        return instance;
    }
}