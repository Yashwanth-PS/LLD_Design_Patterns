package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.Button.IOSButton;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.DropDown.IOSDropDown;
import Creational_Design_Pattern.Factory.Components.Menu.IOSMenu;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() { // Factory Method for Creating Menu Object
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() { // Factory Method for Creating DropDown Object
        return new IOSDropDown();
    }

    @Override
    public Button createButton() { // Factory Method for Creating Button Object
        return new IOSButton();
    }
}
