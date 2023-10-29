package Structural_Design_Pattern.Flyweight;

public class RoboticDog implements IRobot{ // Step2: Implement Flyweight Class - Object of this class is immutable
    // Helps to create Robotic Dog
    private String type; // Intrinsic Data
    private Sprites body; // Intrinsic Data

    RoboticDog(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) { // X and Y are the coordinates
        System.out.println("Using the Robotic Dog Sprites Object the Image is Rendered at: " + x + ", " + y);
    }
}
