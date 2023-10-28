package Structural_Design_Pattern.Decorator;

public class ChocolateChip implements IceCream{ // Can't be Base, Only a Topping
    private IceCream iceCream;

    public ChocolateChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chocolate-Chip ";
    }
}
