package Structural_Design_Pattern.Decorator;

public class ChocolateCone implements IceCream{ // Can be a Base or a Topping
    private IceCream iceCream;
    public ChocolateCone() { // If the Cone is Base

    }
    public ChocolateCone(IceCream iceCream) { // If the Cone is Topping
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) // If the Cone is Base
            return 40;
        else // If the Cone is Topping
            return iceCream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) // If the Cone is Base
            return "Chocolate-Cone ";
        else // If the Cone is Topping
            return iceCream.getDescription() + "Chocolate-Cone ";
    }
}
