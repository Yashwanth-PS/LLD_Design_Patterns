package Behavioral_Design_Pattern.Strategy;
public class PathCalculatorFactory { // Step4: Create a Factory Class to get the Object of the Actual Implementation of a Strategy
    public static PathCalculatorStrategy getPathCalculatorStrategy(TransportationMode mode){
        return switch (mode){
            case CAR -> CarPathCalculatorStrategy.getInstance();
            case BIKE -> BikePathCalculatorStrategy.getInstance();
            case WALK -> WalkPathCalculatorStrategy.getInstance();
        };
    }
}