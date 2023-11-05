package Creational_Design_Pattern.Singleton.Singleton_SynchronizedMethod;

public class Singleton {
    private static Singleton instance; // Step 4a: Private Holder Attribute  To hold the object once it is created
    private Singleton() { // Step 1: Restrict Access to Constructor

    }
    // Step 2: Create a public method to access the constructor and return a singleton object
    public static synchronized Singleton getInstance() { // Step 3: Since we don’t have an object, Make the method static
        if (instance == null) { // Step 4b: Introduce a check in getObject() method
            instance = new Singleton();
        }
        return instance;
    }
}