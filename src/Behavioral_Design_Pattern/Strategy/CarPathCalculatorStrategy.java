package Behavioral_Design_Pattern.Strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{ // Step2: Create the Class with Actual Implementation of a Strategy
    // Optional Step --> Make the Class Singleton
    private static CarPathCalculatorStrategy instance;
    private CarPathCalculatorStrategy() {

    }
    public static CarPathCalculatorStrategy getInstance(){
        if(instance == null){
            synchronized (CarPathCalculatorStrategy.class) {
                if (instance == null) {
                    instance = new CarPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path Calculation via Car from: " + source + " to: " + destination);
    }
}
