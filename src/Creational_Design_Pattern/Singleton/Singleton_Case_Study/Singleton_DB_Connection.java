package Creational_Design_Pattern.Singleton.Singleton_Case_Study;

public class Singleton_DB_Connection {
    private static Singleton_DB_Connection instance; // Step 4a: Private Holder Attribute  To hold the object once it is created
    private int counter;
    private Singleton_DB_Connection() { // Step 1: Restrict Access to Constructor
        counter = 0;
    }
    // Step 2: Create a public method to access the constructor and return a singleton object
    public static Singleton_DB_Connection getInstance() { // Step 3: Since we don’t have an object, Make the method static
        if (instance == null) { // Step 4b: Introduce a check in getObject() method
            synchronized (Singleton_DB_Connection.class) { // Step 5: Double Check Locking  Take lock using class
                if (instance == null) {
                    instance = new Singleton_DB_Connection();
                }
            }
        }
        return instance;
    }
    public void makeConnection() {
        if (counter < 3) {
            counter++;
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}