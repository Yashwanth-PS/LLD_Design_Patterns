package Creational_Design_Pattern.Factory;
public class UIFactoryFactory { // Object creation based on selected platform
    public static UIFactory createUIFactory(SupportedPlatform platform){
        System.out.println("Creating an " + platform + " App");
        return switch (platform){ // Lambda Expression
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}