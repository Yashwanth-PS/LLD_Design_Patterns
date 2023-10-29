package Structural_Design_Pattern.Flyweight;

public class HumanoidRobot implements IRobot { // Step2: Implement Flyweight Class - Object of this class is immutable
    // Helps to create Human Robot Object
    private String type; // Intrinsic Data
    private Sprites body; // Intrinsic Data

    HumanoidRobot(String type, Sprites body){
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
        System.out.println("Using the Humanoid Sprites Object the Image is Rendered at: " + x + ", " + y);
    }
}
