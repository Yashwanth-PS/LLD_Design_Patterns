package Structural_Design_Pattern.Facade;

public class Client { // Facade: Provides a simplified interface to a complex system
    public static void main(String[] args) { // Encapsulating its functionalities and hiding implementation details
        Facade_Helper facadeHelper = new Facade_Helper();
        facadeHelper.drawCircle();
        facadeHelper.drawRectangle();
        facadeHelper.drawSquare();
    }
}