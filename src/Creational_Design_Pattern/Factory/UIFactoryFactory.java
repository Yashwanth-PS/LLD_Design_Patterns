package Creational_Design_Pattern.Factory;

// Step4: Factory of Factory Class: Holds the Create Factory Method for creating Factory Objects
public class UIFactoryFactory { // Object creation based on selected platform
    public static UIFactory createUIFactory(SupportedPlatform platform){

        System.out.println("Creating an " + platform + " App");

        // Lambda Expression is used along with switch case to return the respective factory object
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}