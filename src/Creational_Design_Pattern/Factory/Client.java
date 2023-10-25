package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Menu.Menu;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.Button.Button;

public class Client {
    public static void main(String[] args) {
        // Factory Design Pattern: Choose between objects while object creation
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
    }
}

/*
To Add a new Platform:
    -	Go to Enum (Supported Platform) and Add the Platform
        o	Windows
    -	Create the Components Classes which implements the Parent Interface
        o	Windows Button
        o	Windows DropDown
        o	Windows Menu
    -	Create UI Factory (Windows UI Factory) and Implement the Methods of UI Factory Interface
    -	Add the switch case in UIFactoryFactory
    -	If Windows App is Required in the client we can just create Windows Application
*/