package Structural_Design_Pattern.Decorator;

public class VanillaCone implements IceCream{ // Can be a Base or a Topping
    private IceCream iceCream;
    public VanillaCone() { // If the Cone is Base

    }
    public VanillaCone(IceCream iceCream) { // If the Cone is Topping
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) // If the Cone is Base
            return 35;
        else // If the Cone is Topping
            return iceCream.getCost() + 35;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) // If the Cone is Base
            return "Vanilla-Cone ";
        else // If the Cone is Topping
            return iceCream.getDescription() + "Vanilla-Cone ";
    }
}
