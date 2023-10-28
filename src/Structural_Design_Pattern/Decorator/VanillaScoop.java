package Structural_Design_Pattern.Decorator;

public class VanillaScoop implements IceCream{ // Can't be Base, Only a Topping
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 45;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Vanilla-Scoop ";
    }
}