package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Menu.Menu;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.Button.Button;

public class Client {
    public static void main(String[] args) {
        // Factory Design Pattern: Choose between objects while object creation
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();

    }
}