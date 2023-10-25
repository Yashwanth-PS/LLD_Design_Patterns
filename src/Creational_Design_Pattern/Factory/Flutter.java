package Creational_Design_Pattern.Factory;
public class Flutter {
    // Step 1: Create a class that accepts the Enum Object using the constructor
    private SupportedPlatform platform;
    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Some Theme");
    }
    public void setRefreshRate(){
        System.out.println("Setting Some Refresh Rate");
    }
    // Step 2: Create a method within that class that creates the factory object
    public UIFactory createUIFactory(){ // Depending upon what platform is Chosen, Object of UI Factory is created

        // Step 3: Call the create factory method of the factory of factory class which returns the factory object
        return UIFactoryFactory.createUIFactory(this.platform); // AndroidUIFactory, IOSUIFactory, WindowsUIFactory
    }
}