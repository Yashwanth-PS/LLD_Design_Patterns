package Structural_Design_Pattern.Facade;

public class Facade_Helper {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public Facade_Helper() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}