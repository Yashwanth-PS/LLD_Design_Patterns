package Behavioral_Design_Pattern.Strategy;
public class Maps { // Step5: Create an Object of the Strategy and Use the Method
    public void getPath(String source, String destination, TransportationMode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorStrategy(mode);
        pathCalculatorStrategy.findPath(source, destination);
    }
}