package Structural_Design_Pattern.Decorator;
public class Client {
    // First item used should be Base --> No Topping prior to it --> Base - Bowl or Cone
    // Topping --> For the topping to be used there should be some Base prior to it
    // Cone --> can be a Base, it can also be topping
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateChip(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new ChocolateCone(
                                            new VanillaCone(
                                                new OrangeCone())))));
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}