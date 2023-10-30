package Behavioral_Design_Pattern.Strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{ // Step2: Create the Class with Actual Implementation of a Strategy
    // Optional Step --> Make the Class Singleton
    private static WalkPathCalculatorStrategy instance;
    private WalkPathCalculatorStrategy() {

    }
    public static WalkPathCalculatorStrategy getInstance(){
        if(instance == null){
            synchronized (WalkPathCalculatorStrategy.class) {
                if (instance == null) {
                    instance = new WalkPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path Calculation via Walk from: " + source + " to: " + destination);
    }
}
