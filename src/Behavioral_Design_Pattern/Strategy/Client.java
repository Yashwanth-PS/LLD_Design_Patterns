package Behavioral_Design_Pattern.Strategy;

public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps(); // Uses Default Constructor
        maps.getPath("Bengaluru", "Mysuru", TransportationMode.BIKE);
    }
}

/* Steps for Implementing Strategy Design Pattern:
    Step1: Create a Strategy Interface with an Abstract Method
    Step2: Create the Classes with Actual Implementation of Strategies
        Optional Step: Make the Strategy Classes Singleton (Only if required)
    Step3: Create an Enum based on which the Strategies should work
    Step4: Create a Factory Class to get the Object of the Actual Implementation of a Strategy
    Step5: Create a Object of the Strategy and Use the Method*/