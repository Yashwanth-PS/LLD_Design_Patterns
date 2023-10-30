package Behavioral_Design_Pattern.Strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{ // Step2: Create the Class with Actual Implementation of a Strategy
    // Optional Step --> Make the Class Singleton
    private static BikePathCalculatorStrategy instance;
    private BikePathCalculatorStrategy() {

    }
    public static BikePathCalculatorStrategy getInstance(){
        if(instance == null){
            synchronized (BikePathCalculatorStrategy.class) {
                if (instance == null) {
                    instance = new BikePathCalculatorStrategy();
                }
            }
        }
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path Calculation via Bike from: " + source + " to: " + destination);
    }
}
