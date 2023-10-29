package Structural_Design_Pattern.Flyweight;

public class Client {

    public static void main(String args[]){

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1,2); // Step4: Extrinsic Data passed to Flyweight class in Method Parameter

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10,30); // Step4: Extrinsic Data passed to Flyweight class in Method Parameter

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2,9); // Step4: Extrinsic Data passed to Flyweight class in Method Parameter

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19); // Step4: Extrinsic Data passed to Flyweight class in Method Parameter

    }
}
