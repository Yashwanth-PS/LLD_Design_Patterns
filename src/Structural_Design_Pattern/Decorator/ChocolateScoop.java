package Structural_Design_Pattern.Decorator;

public class ChocolateScoop implements IceCream{ // Can't be Base, Only a Topping
    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chocolate-Scoop ";
    }
}