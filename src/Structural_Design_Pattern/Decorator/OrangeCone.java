package Structural_Design_Pattern.Decorator;

public class OrangeCone implements IceCream{ // Can be a Base or a Topping
    private IceCream iceCream;
    public OrangeCone() { // If the Cone is Base

    }
    public OrangeCone(IceCream iceCream) { // If the Cone is Topping
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) // If the Cone is Base
            return 30;
        else // If the Cone is Topping
            return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) // If the Cone is Base
            return "Orange-Cone ";
        else // If the Cone is Topping
            return iceCream.getDescription() + "Orange-Cone ";
    }
}
