package Structural_Design_Pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory { // Step 3: Factory - The Object is Created and Cached and Reused whenever required

    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){

        if(roboticObjectCache.containsKey(robotType)){ // If the Object is already present in Cache
            return roboticObjectCache.get(robotType); // The Object is Reused Whenever Required
        }
        else {
            IRobot robot = null;
            Sprites sprite = new Sprites(); // For Rendering Image
            if(robotType == "HUMANOID")
                robot = new HumanoidRobot(robotType, sprite); // Object is Created
            else if(robotType == "ROBOTICDOG")
                robot = new RoboticDog(robotType, sprite); // Object is Created
            roboticObjectCache.put(robotType, robot); // The Object is Cached
            return robot;
        }
    }
}