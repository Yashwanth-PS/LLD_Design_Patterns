package Creational_Design_Pattern.Factory;
public class UIFactoryFactory { // Object creation based on selected platform
    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){ // Lambda Expression
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndoidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}