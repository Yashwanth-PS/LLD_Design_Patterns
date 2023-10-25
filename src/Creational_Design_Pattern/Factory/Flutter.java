package Creational_Design_Pattern.Factory;
public class Flutter {
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
    public UIFactory createUIFactory(){ // Depending upon what platform is Chosen, Object of UI Factory is created
        return UIFactoryFactory.createUIFactory(this.platform); // AndroidUIFactory, IOSUIFactory, WindowsUIFactory
    }
}