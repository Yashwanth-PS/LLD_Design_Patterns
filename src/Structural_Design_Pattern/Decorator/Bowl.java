package Structural_Design_Pattern.Decorator;

public class Bowl implements IceCream{ // Only a Base
    public Bowl(){
    }

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Bowl ";
    }
}
